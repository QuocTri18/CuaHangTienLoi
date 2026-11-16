package entity;

import java.util.Objects;

public class LoaiKhachHang {
    private String maLoaiKH;
    private String tenLoaiKH;

    public LoaiKhachHang() {
    }

    public LoaiKhachHang(String maLoaiKH, String tenLoaiKH) {
        this.maLoaiKH = maLoaiKH;
        this.tenLoaiKH = tenLoaiKH;
    }

    public String getMaLoaiKH() {
        return maLoaiKH;
    }

    public void setMaLoaiKH(String maLoaiKH) {
        this.maLoaiKH = maLoaiKH;
    }

    public String getTenLoaiKH() {
        return tenLoaiKH;
    }

    public void setTenLoaiKH(String tenLoaiKH) {
        this.tenLoaiKH = tenLoaiKH;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LoaiKhachHang that = (LoaiKhachHang) o;
        return Objects.equals(getMaLoaiKH(), that.getMaLoaiKH()) && Objects.equals(getTenLoaiKH(), that.getTenLoaiKH());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaLoaiKH(), getTenLoaiKH());
    }

    @Override
    public String toString() {
        return "LoaiKhachHang{" +
                "maLoaiKH='" + maLoaiKH + '\'' +
                ", tenLoaiKH='" + tenLoaiKH + '\'' +
                '}';
    }
}