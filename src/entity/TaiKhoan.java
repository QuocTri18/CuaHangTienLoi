package entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class TaiKhoan {
    private String tenDangNhap;
    private NhanVien nhanVien;
    private String matKhau;
    private LocalDateTime ngayCap;

    public TaiKhoan() {
    }

    public TaiKhoan(String tenDangNhap, LocalDateTime ngayCap, String matKhau, NhanVien nhanVien) {
        this.tenDangNhap = tenDangNhap;
        this.ngayCap = ngayCap;
        this.matKhau = matKhau;
        this.nhanVien = nhanVien;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public LocalDateTime getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(LocalDateTime ngayCap) {
        this.ngayCap = ngayCap;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TaiKhoan taiKhoan = (TaiKhoan) o;
        return Objects.equals(getTenDangNhap(), taiKhoan.getTenDangNhap()) && Objects.equals(getNhanVien(), taiKhoan.getNhanVien()) && Objects.equals(getMatKhau(), taiKhoan.getMatKhau()) && Objects.equals(getNgayCap(), taiKhoan.getNgayCap());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTenDangNhap(), getNhanVien(), getMatKhau(), getNgayCap());
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "tenDangNhap='" + tenDangNhap + '\'' +
                ", nhanVien=" + nhanVien +
                ", matKhau='" + matKhau + '\'' +
                ", ngayCap=" + ngayCap +
                '}';
    }
}