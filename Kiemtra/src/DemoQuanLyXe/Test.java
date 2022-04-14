package DemoQuanLyXe;

public class Test {
    public static void main(String[] args) {
        QuanLyXeMay qlxm = new QuanLyXeMay();
        XeMay xm1 = new XeMay("Honda", "Đen", "adv", 120, 300);
        XeMay xm2 = new XeMay("Honda", "Đỏ", "asv", 180, 300);
        XeMay xm3 = new XeMay("Honda", "Đỏ Đen", "awv", 150, 300);

        qlxm.them(xm1);
        qlxm.them(xm2);
        qlxm.them(xm3);
        qlxm.print();
        qlxm.sapXep();
        System.out.println(qlxm.timKiem("asv"));

        XeMay xm4 = new XeMay("Honda", "Xanh", "awv", 150, 500);
        qlxm.sua("awv", xm4);
        qlxm.print();
        qlxm.xoa("awv");
        qlxm.print();

        QuanLyOto qlot = new QuanLyOto();
        Oto ot1 = new Oto("Honda", "Đen", "adv", 620, 800);
        Oto ot2 = new Oto("Ford", "Đỏ", "asv", 880, 800);
        Oto ot3 = new Oto("Ferrari", "Đỏ Đen", "awv", 1500, 800);

        qlot.them(ot1);
        qlot.them(ot2);
        qlot.them(ot3);
        qlot.print();
        qlot.sapXep();
        System.out.println(qlot.timKiem("asv"));

        Oto ot4 = new Oto("Lamborghini", "Xanh", "awv", 2500, 1000);
        qlot.sua("awv", ot4);
        qlot.print();
        qlot.xoa("Honda");
        qlot.print();
    }
}
