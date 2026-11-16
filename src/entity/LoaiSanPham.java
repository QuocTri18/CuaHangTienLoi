package entity;

import java.util.Objects;

public class LoaiSanPham {
    private String maLoai;
    private String tenLoai;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String maLoai, String tenLoai) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LoaiSanPham that = (LoaiSanPham) o;
        return Objects.equals(getMaLoai(), that.getMaLoai()) && Objects.equals(getTenLoai(), that.getTenLoai());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaLoai(), getTenLoai());
    }

    @Override
    public String toString() {
        return "LoaiSanPham{" +
                "maLoai='" + maLoai + '\'' +
                ", tenLoai='" + tenLoai + '\'' +
                '}';
    }
}
