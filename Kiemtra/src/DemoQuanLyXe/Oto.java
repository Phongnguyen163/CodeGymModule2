package DemoQuanLyXe;

public class Oto extends PhuongTien implements Comparable<Oto>{
    private int choNgoi;

    public Oto() {

    }

    public Oto(String hang, String mau, String ten, int gia, int choNgoi) {
        super(hang, mau, ten, gia);
        this.choNgoi = choNgoi;
    }

    public int getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    @Override
    public String toString() {
        return "Oto{name: " + getTen() +
                ", choNgoi: " + choNgoi +
                ", gia: " + getGia() +
                '}';
    }

    @Override
    public int compareTo(Oto o) {
        return this.getGia() - o.getGia();
    }
}
