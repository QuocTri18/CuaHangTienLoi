package entity;

import java.util.Objects;

public class NhaCungCap {
    private String maNCC;
    private String tenNCC;

    public NhaCungCap() {
    }

    public NhaCungCap(String maNCC, String tenNCC) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NhaCungCap that = (NhaCungCap) o;
        return Objects.equals(getMaNCC(), that.getMaNCC()) && Objects.equals(getTenNCC(), that.getTenNCC());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaNCC(), getTenNCC());
    }

    @Override
    public String toString() {
        return "NhaCungCap{" +
                "maNCC='" + maNCC + '\'' +
                ", tenNCC='" + tenNCC + '\'' +
                '}';
    }
}
