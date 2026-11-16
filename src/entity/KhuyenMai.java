package entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class KhuyenMai {
    private String maKM;
    private String tenKM;
    private String moTaKM;
    private String dieuKienApDung;
    private LocalDateTime thoiHan;

    public KhuyenMai() {
    }

    public KhuyenMai(String maKM, String tenKM, String moTaKM, String dieuKienApDung, LocalDateTime thoiHan) {
        this.maKM = maKM;
        this.tenKM = tenKM;
        this.moTaKM = moTaKM;
        this.dieuKienApDung = dieuKienApDung;
        this.thoiHan = thoiHan;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public String getMoTaKM() {
        return moTaKM;
    }

    public void setMoTaKM(String moTaKM) {
        this.moTaKM = moTaKM;
    }

    public String getTenKM() {
        return tenKM;
    }

    public void setTenKM(String tenKM) {
        this.tenKM = tenKM;
    }

    public String getDieuKienApDung() {
        return dieuKienApDung;
    }

    public void setDieuKienApDung(String dieuKienApDung) {
        this.dieuKienApDung = dieuKienApDung;
    }

    public LocalDateTime getThoiHan() {
        return thoiHan;
    }

    public void setThoiHan(LocalDateTime thoiHan) {
        this.thoiHan = thoiHan;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        KhuyenMai khuyenMai = (KhuyenMai) o;
        return Objects.equals(getMaKM(), khuyenMai.getMaKM()) && Objects.equals(getTenKM(), khuyenMai.getTenKM()) && Objects.equals(getMoTaKM(), khuyenMai.getMoTaKM()) && Objects.equals(getDieuKienApDung(), khuyenMai.getDieuKienApDung()) && Objects.equals(getThoiHan(), khuyenMai.getThoiHan());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaKM(), getTenKM(), getMoTaKM(), getDieuKienApDung(), getThoiHan());
    }

    @Override
    public String toString() {
        return "KhuyenMai{" +
                "maKM='" + maKM + '\'' +
                ", tenKM='" + tenKM + '\'' +
                ", moTaKM='" + moTaKM + '\'' +
                ", dieuKienApDung='" + dieuKienApDung + '\'' +
                ", thoiHan=" + thoiHan +
                '}';
    }
}