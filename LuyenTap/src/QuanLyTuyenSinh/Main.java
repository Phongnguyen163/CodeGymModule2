package QuanLyTuyenSinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuyenSinh ts = new TuyenSinh();
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Tim sinh vien");
            System.out.println("3. Hien thi thong tin sinh vien");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            if (choice == 1) {
                SinhVien sv = new SinhVien();
                System.out.print("Nhap so bao danh: ");
                String id = scanner.nextLine();
                System.out.print("Nhap ten: ");
                String ten = scanner.nextLine();
                System.out.print("Nhap dia chi: ");
                String diaChi = scanner.nextLine();
                System.out.print("Nhap khoi thi: ");
                String khoiThi = scanner.nextLine();
                System.out.print("Nhap muc uu tien: ");
                int mucUuTien = sc.nextInt();
                sv.setId(id);
                sv.setName(ten);
                sv.setDiaChi(diaChi);
                sv.setKhoiThi(khoiThi);
                sv.setMucUuTien(mucUuTien);
                ts.themSV(sv);
            }
            if (choice == 2) {
                System.out.println("Nhap so bao danh");
                String id = scanner.nextLine();
                ts.timTheoId(id);
            }
            if (choice == 3) {
                ts.display();
            }
            if (choice == 0) {
                ts.thoat();
            }
        }
        while (choice < 0);
    }
}
