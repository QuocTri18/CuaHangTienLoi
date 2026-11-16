package entity;

import java.util.Objects;

public class ChiTietPhieuDatHang {
    private PhieuDatHang phieuDatHang;
    private SanPham sanPham;
    private int soLuong;
    private double donGia;

    public ChiTietPhieuDatHang() {
    }

    public ChiTietPhieuDatHang(PhieuDatHang phieuDatHang, SanPham sanPham, int soLuong, double donGia) {
        this.phieuDatHang = phieuDatHang;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public PhieuDatHang getPhieuDatHang() {
        return phieuDatHang;
    }

    public void setPhieuDatHang(PhieuDatHang phieuDatHang) {
        this.phieuDatHang = phieuDatHang;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ChiTietPhieuDatHang that = (ChiTietPhieuDatHang) o;
        return getSoLuong() == that.getSoLuong() && Double.compare(getDonGia(), that.getDonGia()) == 0 && Objects.equals(getPhieuDatHang(), that.getPhieuDatHang()) && Objects.equals(getSanPham(), that.getSanPham());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPhieuDatHang(), getSanPham(), getSoLuong(), getDonGia());
    }

    @Override
    public String toString() {
        return "ChiTietPhieuDatHang{" +
                "phieuDatHang=" + phieuDatHang +
                ", sanPham=" + sanPham +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }
}