package QuanLyTinh;

public class Nguoi {
    private int ma;
    private String ten;
    private int tuoi;
    private String diaChi;
    QuanLyTinh quanLiTinh = new QuanLyTinh();

    public Nguoi() {
    }

    public Nguoi(int ma, String ten, int tuoi, String diaChi) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
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

    public int getTuoi() {
        return this.tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String toString() {
        return "Nguoi{ma=" + this.ma + ", ten='" + this.ten + "', tuoi=" + this.tuoi + ", diaChi='" + this.diaChi + "'}";
    }
}
