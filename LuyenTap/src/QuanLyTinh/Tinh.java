package QuanLyTinh;

public class Tinh {
    private int ma;
    private String ten;
    private long danSo;
    private double GDP;

    public Tinh() {
    }

    public Tinh(int ma, String ten, long danSo, double GDP) {
        this.ma = ma;
        this.ten = ten;
        this.danSo = danSo;
        this.GDP = GDP;
    }

    public int getMa() {
        return this.ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getDanSo() {
        return this.danSo;
    }

    public void setDanSo(long danSo) {
        this.danSo = danSo;
    }

    public double getGDP() {
        return this.GDP;
    }

    public void setGDP(int GDP) {
        this.GDP = (double)GDP;
    }

    public String toString() {
        return "Tinh{ma=" + this.ma + ", ten='" + this.ten + "', danSo=" + this.danSo + ", GDP=" + this.GDP + "}";
    }
}
