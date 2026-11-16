package entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class NhanVien {
    private String maNV;
    private String tenNV;
    private LocalDateTime ngaySinh;
    private String cccd;
    private String sdt;
    private ChucVu chucVu;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, LocalDateTime ngaySinh, String cccd, String sdt, ChucVu chucVu) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.ngaySinh = ngaySinh;
        this.cccd = cccd;
        this.sdt = sdt;
        this.chucVu = chucVu;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public LocalDateTime getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDateTime ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NhanVien nhanVien = (NhanVien) o;
        return Objects.equals(getMaNV(), nhanVien.getMaNV()) && Objects.equals(getTenNV(), nhanVien.getTenNV()) && Objects.equals(getNgaySinh(), nhanVien.getNgaySinh()) && Objects.equals(getCccd(), nhanVien.getCccd()) && Objects.equals(getSdt(), nhanVien.getSdt()) && Objects.equals(getChucVu(), nhanVien.getChucVu());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaNV(), getTenNV(), getNgaySinh(), getCccd(), getSdt(), getChucVu());
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", tenNV='" + tenNV + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", cccd='" + cccd + '\'' +
                ", sdt='" + sdt + '\'' +
                ", chucVu=" + chucVu +
                '}';
    }
}