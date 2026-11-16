package entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class HoaDon {
    private String maHoaDon;
    private NhanVien nhanVien;
    private LocalDateTime ngayLap;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, NhanVien nhanVien, LocalDateTime ngayLap) {
        this.maHoaDon = maHoaDon;
        this.nhanVien = nhanVien;
        this.ngayLap = ngayLap;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public LocalDateTime getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDateTime ngayLap) {
        this.ngayLap = ngayLap;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HoaDon hoaDon = (HoaDon) o;
        return Objects.equals(getMaHoaDon(), hoaDon.getMaHoaDon()) && Objects.equals(getNhanVien(), hoaDon.getNhanVien()) && Objects.equals(getNgayLap(), hoaDon.getNgayLap());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaHoaDon(), getNhanVien(), getNgayLap());
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", nhanVien=" + nhanVien +
                ", ngayLap=" + ngayLap +
                '}';
    }
}