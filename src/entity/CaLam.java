package entity;

import java.util.Objects;

public class CaLam {
    private String maCa;
    private String tenCa;
    private String thoiGianLam;

    public CaLam() {
    }

    public CaLam(String maCa, String tenCa, String thoiGianLam) {
        this.maCa = maCa;
        this.tenCa = tenCa;
        this.thoiGianLam = thoiGianLam;
    }

    public String getMaCa() {
        return maCa;
    }

    public void setMaCa(String maCa) {
        this.maCa = maCa;
    }

    public String getTenCa() {
        return tenCa;
    }

    public void setTenCa(String tenCa) {
        this.tenCa = tenCa;
    }

    public String getThoiGianLam() {
        return thoiGianLam;
    }

    public void setThoiGianLam(String thoiGianLam) {
        this.thoiGianLam = thoiGianLam;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CaLam caLam = (CaLam) o;
        return Objects.equals(getMaCa(), caLam.getMaCa()) && Objects.equals(getTenCa(), caLam.getTenCa()) && Objects.equals(getThoiGianLam(), caLam.getThoiGianLam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaCa(), getTenCa(), getThoiGianLam());
    }

    @Override
    public String toString() {
        return "CaLam{" +
                "maCa='" + maCa + '\'' +
                ", tenCa='" + tenCa + '\'' +
                ", thoiGianLam='" + thoiGianLam + '\'' +
                '}';
    }
}