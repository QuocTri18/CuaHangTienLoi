package entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class ChiTietPhanCa {
    private NhanVien nhanVien;
    private CaLam caLam;
    private LocalDateTime ngayLam;

    public ChiTietPhanCa() {
    }

    public ChiTietPhanCa(NhanVien nhanVien, CaLam caLam, LocalDateTime ngayLam) {
        this.nhanVien = nhanVien;
        this.caLam = caLam;
        this.ngayLam = ngayLam;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public CaLam getCaLam() {
        return caLam;
    }

    public void setCaLam(CaLam caLam) {
        this.caLam = caLam;
    }

    public LocalDateTime getNgayLam() {
        return ngayLam;
    }

    public void setNgayLam(LocalDateTime ngayLam) {
        this.ngayLam = ngayLam;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ChiTietPhanCa that = (ChiTietPhanCa) o;
        return Objects.equals(getNhanVien(), that.getNhanVien()) && Objects.equals(getCaLam(), that.getCaLam()) && Objects.equals(getNgayLam(), that.getNgayLam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNhanVien(), getCaLam(), getNgayLam());
    }

    @Override
    public String toString() {
        return "ChiTietPhanCa{" +
                "nhanVien=" + nhanVien +
                ", caLam=" + caLam +
                ", ngayLam=" + ngayLam +
                '}';
    }
}