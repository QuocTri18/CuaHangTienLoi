package dao;

import database.ConnectDatabase;
import entity.KhuyenMai;
import entity.LoaiSanPham;
import entity.NhaCungCap;
import entity.SanPham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SanPhamDAO {

    /**
     * Hàm hỗ trợ ánh xạ dữ liệu từ ResultSet sang đối tượng SanPham (kèm các đối tượng tham chiếu)
     */
    private SanPham mapResultSetToSanPham(ResultSet rs) throws SQLException {
        // 1. Ánh xạ NhaCungCap
        NhaCungCap ncc = new NhaCungCap();
        ncc.setMaNCC(rs.getString("MaNCC"));
        ncc.setTenNCC(rs.getString("TenNCC"));

        // 2. Ánh xạ LoaiSanPham
        LoaiSanPham loai = new LoaiSanPham();
        loai.setMaLoai(rs.getString("MaLoai"));
        loai.setTenLoai(rs.getString("TenLoai"));

        // 3. Ánh xạ KhuyenMai (MaKM có thể NULL trong CSDL)
        KhuyenMai km = null;
        String maKM = rs.getString("MaKM");
        if (maKM != null) {
            km = new KhuyenMai();
            km.setMaKM(maKM);
            km.setTenKM(rs.getString("TenKM"));
            km.setMoTaKM(rs.getString("MoTaKM"));
            km.setDieuKienApDung(rs.getString("DieuKienApDung"));
            Timestamp thoiHan = rs.getTimestamp("ThoiHan");
            if (thoiHan != null) {
                km.setThoiHan(thoiHan.toLocalDateTime());
            }
        }

        // 4. Ánh xạ SanPham
        SanPham sp = new SanPham();
        sp.setMaSP(rs.getString("MaSP"));
        sp.setTenSP(rs.getString("TenSP"));
        sp.setNhaCungCap(ncc);
        sp.setLoaiSanPham(loai);
        sp.setDonGia(rs.getDouble("DonGia"));

        Timestamp hanSD = rs.getTimestamp("HanSD");
        if (hanSD != null) {
            sp.setHanSD(hanSD.toLocalDateTime());
        }
        sp.setKhuyenMai(km);

        return sp;
    }

    /**
     * Lấy danh sách toàn bộ sản phẩm
     */
    public List<SanPham> findAll() {
        List<SanPham> dsSanPham = new ArrayList<>();
        String sql = "SELECT sp.MaSP, sp.TenSP, sp.DonGia, sp.HanSD, " +
                "ncc.MaNCC, ncc.TenNCC, " +
                "lsp.MaLoai, lsp.TenLoai, " +
                "km.MaKM, km.TenKM, km.MoTaKM, km.DieuKienApDung, km.ThoiHan " +
                "FROM SanPham sp " +
                "INNER JOIN NhaCungCap ncc ON sp.MaNCC = ncc.MaNCC " +
                "INNER JOIN LoaiSanPham lsp ON sp.MaLoai = lsp.MaLoai " +
                "LEFT JOIN KhuyenMai km ON sp.MaKM = km.MaKM";

        try (Connection conn = ConnectDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                dsSanPham.add(mapResultSetToSanPham(rs));
            }
        } catch (SQLException e) {
            System.err.println("Lỗi findAll SanPham: " + e.getMessage());
        }
        return dsSanPham;
    }

    /**
     * Tìm sản phẩm theo mã sản phẩm (MaSP)
     */
    public Optional<SanPham> findById(String id) {
        String sql = "SELECT sp.MaSP, sp.TenSP, sp.DonGia, sp.HanSD, " +
                "ncc.MaNCC, ncc.TenNCC, " +
                "lsp.MaLoai, lsp.TenLoai, " +
                "km.MaKM, km.TenKM, km.MoTaKM, km.DieuKienApDung, km.ThoiHan " +
                "FROM SanPham sp " +
                "INNER JOIN NhaCungCap ncc ON sp.MaNCC = ncc.MaNCC " +
                "INNER JOIN LoaiSanPham lsp ON sp.MaLoai = lsp.MaLoai " +
                "LEFT JOIN KhuyenMai km ON sp.MaKM = km.MaKM " +
                "WHERE sp.MaSP = ?";

        try (Connection conn = ConnectDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(mapResultSetToSanPham(rs));
                }
            }
        } catch (SQLException e) {
            System.err.println("Lỗi findById SanPham: " + e.getMessage());
        }
        return Optional.empty();
    }

    /**
     * Thêm mới một sản phẩm
     */
    public boolean addSanPham(SanPham sp) {
        String sql = "INSERT INTO SanPham (MaSP, TenSP, MaNCC, MaLoai, DonGia, HanSD, MaKM) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, sp.getMaSP());
            ps.setString(2, sp.getTenSP());
            ps.setString(3, sp.getNhaCungCap().getMaNCC());
            ps.setString(4, sp.getLoaiSanPham().getMaLoai());
            ps.setDouble(5, sp.getDonGia());

            if (sp.getHanSD() != null) {
                ps.setTimestamp(6, Timestamp.valueOf(sp.getHanSD()));
            } else {
                ps.setNull(6, Types.TIMESTAMP);
            }

            if (sp.getKhuyenMai() != null && sp.getKhuyenMai().getMaKM() != null) {
                ps.setString(7, sp.getKhuyenMai().getMaKM());
            } else {
                ps.setNull(7, Types.NVARCHAR);
            }

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Lỗi addSanPham: " + e.getMessage());
            return false;
        }
    }

    /**
     * Xóa sản phẩm theo mã sản phẩm (MaSP)
     */
    public boolean deleteById(String id) {
        String sql = "DELETE FROM SanPham WHERE MaSP = ?";

        try (Connection conn = ConnectDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Lỗi deleteById SanPham: " + e.getMessage());
            return false;
        }
    }

    /**
     * Cập nhật thông tin sản phẩm theo mã idSP
     */
    public boolean updateSanPham(String idSP, SanPham SPNew) {
        String sql = "UPDATE SanPham " +
                "SET TenSP = ?, MaNCC = ?, MaLoai = ?, DonGia = ?, HanSD = ?, MaKM = ? " +
                "WHERE MaSP = ?";

        try (Connection conn = ConnectDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, SPNew.getTenSP());
            ps.setString(2, SPNew.getNhaCungCap().getMaNCC());
            ps.setString(3, SPNew.getLoaiSanPham().getMaLoai());
            ps.setDouble(4, SPNew.getDonGia());

            if (SPNew.getHanSD() != null) {
                ps.setTimestamp(5, Timestamp.valueOf(SPNew.getHanSD()));
            } else {
                ps.setNull(5, Types.TIMESTAMP);
            }

            if (SPNew.getKhuyenMai() != null && SPNew.getKhuyenMai().getMaKM() != null) {
                ps.setString(6, SPNew.getKhuyenMai().getMaKM());
            } else {
                ps.setNull(6, Types.NVARCHAR);
            }

            ps.setString(7, idSP);

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Lỗi updateSanPham: " + e.getMessage());
            return false;
        }
    }
}