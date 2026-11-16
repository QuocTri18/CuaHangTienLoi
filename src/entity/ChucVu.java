package entity;

import java.util.Objects;

public class ChucVu {
    private String maCV;
    private String tenCV;

    public ChucVu() {
    }

    public ChucVu(String maCV, String tenCV) {
        this.maCV = maCV;
        this.tenCV = tenCV;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ChucVu chucVu = (ChucVu) o;
        return Objects.equals(getMaCV(), chucVu.getMaCV()) && Objects.equals(getTenCV(), chucVu.getTenCV());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaCV(), getTenCV());
    }

    @Override
    public String toString() {
        return "ChucVu{" +
                "maCV='" + maCV + '\'' +
                ", tenCV='" + tenCV + '\'' +
                '}';
    }
}