package entity;

import java.util.Objects;

public class ChiTietHoaDon {
    private HoaDon hoaDon;
    private SanPham sanPham;
    private int soLuong;
    private double donGia;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(HoaDon hoaDon, SanPham sanPham, int soLuong, double donGia) {
        this.hoaDon = hoaDon;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
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
        ChiTietHoaDon that = (ChiTietHoaDon) o;
        return getSoLuong() == that.getSoLuong() && Double.compare(getDonGia(), that.getDonGia()) == 0 && Objects.equals(getHoaDon(), that.getHoaDon()) && Objects.equals(getSanPham(), that.getSanPham());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHoaDon(), getSanPham(), getSoLuong(), getDonGia());
    }

    @Override
    public String toString() {
        return "ChiTietHoaDon{" +
                "hoaDon=" + hoaDon +
                ", sanPham=" + sanPham +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }
}