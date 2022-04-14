package DemoQuanLyXe;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        QuanLyXeMay qlxm = new QuanLyXeMay();
        XeMay xm1 = new XeMay("Honda", "Đen", "adv", 120, 300);
        XeMay xm2 = new XeMay("Honda", "Đỏ", "asv", 180, 300);
        XeMay xm3 = new XeMay("Honda", "Đỏ Đen", "awv", 150, 300);

        qlxm.them(xm1);
        qlxm.them(xm2);
        qlxm.them(xm3);
        qlxm.print();

        do{
            System.out.println("Lua chon phuong thuc: ");
            System.out.println("1.Them xe");
            System.out.println("2.Sua xe");
            System.out.println("3.Xoa xe");
            System.out.println("4.Tim xe");
            System.out.println("0.Thoat");
            System.out.println("--------------------");
            choice = sc.nextInt();
            if(choice == 1) {
                System.out.println("Nhap thong tin xe muon them");
                System.out.print("Hang: ");
                String hang = sc.next();
                System.out.print("Ten: ");
                String ten = sc.next();
                System.out.print("Mau: ");
                String mau = sc.next();
                System.out.print("Gia: ");
                int gia = sc.nextInt();
                System.out.print("Dung tich: ");
                int dungTich = sc.nextInt();
                XeMay xm4 = new XeMay();
                xm4.setHang(hang);
                xm4.setTen(ten);
                xm4.setMau(mau);
                xm4.setGia(gia);
                xm4.setDungTich(dungTich);
                qlxm.them(xm4);
                qlxm.print();
            }
            else if (choice == 2) {
                System.out.println("Nhap thong tin xe muon sua");
                System.out.print("Hang: ");
                String hang = sc.next();
                System.out.print("Ten: ");
                String ten = sc.next();
                System.out.print("Mau: ");
                String mau = sc.next();
                System.out.print("Gia: ");
                int gia = sc.nextInt();
                System.out.print("Dung tich: ");
                int dungTich = sc.nextInt();
                XeMay xm4 = new XeMay();
                xm4.setHang(hang);
                xm4.setTen(ten);
                xm4.setMau(mau);
                xm4.setGia(gia);
                xm4.setDungTich(dungTich);
                qlxm.sua(ten, xm4);
                qlxm.print();
            }
            else if (choice == 3) {
                System.out.print("Nhap ten xe muon xoa: ");
                String ten = sc.next();
                qlxm.xoa(ten);
                qlxm.print();
            }
            else if (choice == 4) {
                System.out.print("Nhap ten xe muon tim: ");
                String ten = sc.next();
                System.out.println(qlxm.timKiem(ten));
            }
        }
        while (choice > 0 );

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
        qlot.xoa("awv");
        qlot.print();
    }
}
