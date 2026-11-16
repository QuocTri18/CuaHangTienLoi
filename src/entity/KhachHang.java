package entity;

import java.util.Objects;

public class KhachHang {
    private String maKH;
    private String tenKH;
    private LoaiKhachHang loaiKhachHang;
    private String sdt;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, LoaiKhachHang loaiKhachHang, String sdt) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.loaiKhachHang = loaiKhachHang;
        this.sdt = sdt;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public LoaiKhachHang getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(LoaiKhachHang loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        KhachHang khachHang = (KhachHang) o;
        return Objects.equals(getMaKH(), khachHang.getMaKH()) && Objects.equals(getTenKH(), khachHang.getTenKH()) && Objects.equals(getLoaiKhachHang(), khachHang.getLoaiKhachHang()) && Objects.equals(getSdt(), khachHang.getSdt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaKH(), getTenKH(), getLoaiKhachHang(), getSdt());
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKH='" + maKH + '\'' +
                ", tenKH='" + tenKH + '\'' +
                ", loaiKhachHang=" + loaiKhachHang +
                ", sdt='" + sdt + '\'' +
                '}';
    }
}