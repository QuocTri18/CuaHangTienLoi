package entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class SanPham {
    private String maSP;
    private String tenSP;
    private NhaCungCap nhaCungCap;
    private LoaiSanPham loaiSanPham;
    private double donGia;
    private LocalDateTime hanSD;
    private KhuyenMai khuyenMai;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, NhaCungCap nhaCungCap, LoaiSanPham loaiSanPham, double donGia, LocalDateTime hanSD, KhuyenMai khuyenMai) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.nhaCungCap = nhaCungCap;
        this.loaiSanPham = loaiSanPham;
        this.donGia = donGia;
        this.hanSD = hanSD;
        this.khuyenMai = khuyenMai;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public NhaCungCap getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(NhaCungCap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public LoaiSanPham getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public LocalDateTime getHanSD() {
        return hanSD;
    }

    public void setHanSD(LocalDateTime hanSD) {
        this.hanSD = hanSD;
    }

    public KhuyenMai getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(KhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SanPham sanPham = (SanPham) o;
        return Double.compare(getDonGia(), sanPham.getDonGia()) == 0 && Objects.equals(getMaSP(), sanPham.getMaSP()) && Objects.equals(getTenSP(), sanPham.getTenSP()) && Objects.equals(getNhaCungCap(), sanPham.getNhaCungCap()) && Objects.equals(getLoaiSanPham(), sanPham.getLoaiSanPham()) && Objects.equals(getHanSD(), sanPham.getHanSD()) && Objects.equals(getKhuyenMai(), sanPham.getKhuyenMai());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaSP(), getTenSP(), getNhaCungCap(), getLoaiSanPham(), getDonGia(), getHanSD(), getKhuyenMai());
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", nhaCungCap=" + nhaCungCap +
                ", loaiSanPham=" + loaiSanPham +
                ", donGia=" + donGia +
                ", hanSD=" + hanSD +
                ", khuyenMai=" + khuyenMai +
                '}';
    }
}