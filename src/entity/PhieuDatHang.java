package entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class PhieuDatHang {
    private String maPhieu;
    private KhachHang khachHang;
    private LocalDateTime ngayDat;
    private String trangThai;
    private String diaChi;

    public PhieuDatHang() {
    }

    public PhieuDatHang(String maPhieu, KhachHang khachHang, LocalDateTime ngayDat, String trangThai, String diaChi) {
        this.maPhieu = maPhieu;
        this.khachHang = khachHang;
        this.ngayDat = ngayDat;
        this.trangThai = trangThai;
        this.diaChi = diaChi;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public LocalDateTime getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(LocalDateTime ngayDat) {
        this.ngayDat = ngayDat;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PhieuDatHang that = (PhieuDatHang) o;
        return Objects.equals(getMaPhieu(), that.getMaPhieu()) && Objects.equals(getKhachHang(), that.getKhachHang()) && Objects.equals(getNgayDat(), that.getNgayDat()) && Objects.equals(getTrangThai(), that.getTrangThai()) && Objects.equals(getDiaChi(), that.getDiaChi());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaPhieu(), getKhachHang(), getNgayDat(), getTrangThai(), getDiaChi());
    }

    @Override
    public String toString() {
        return "PhieuDatHang{" +
                "maPhieu='" + maPhieu + '\'' +
                ", khachHang=" + khachHang +
                ", ngayDat=" + ngayDat +
                ", trangThai='" + trangThai + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}