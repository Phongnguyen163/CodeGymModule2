package QuanLyDanhBa;

import java.io.*;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLy qldb = new QuanLy();
        int choice = -1;
        Menu.menu();
        do {
            Scanner scl = new Scanner(System.in);
            Scanner scn = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);
            do {
                if (choice > 8) {
                    System.out.println("Vui lòng nhập lựa chọn trong menu!");
                }
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.err.println("Nhập đúng lựa chọn đi bro!");
                }
            } while (choice < 1 || choice > 8);
            switch (choice) {
                case 1:
                    qldb.hienThi();
                    break;
                case 2:
                    them(qldb, scl, scn);
                    break;
                case 3:
                    sua(qldb, scl, scn);
                    break;
                case 4:
                    xoa(qldb, scn);
                    break;
                case 5:
                    timGanDung(qldb, scl);
                    break;
                case 6:
                    try {
                        docFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    try {
                        ghiFile(qldb);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 8:
                    System.exit(0);
            }
        }
        while (true);
    }

    private static void ghiFile(QuanLy qldb) throws IOException {
        FileWriter pw = new FileWriter("contacts.csv");
        BufferedWriter bw = new BufferedWriter(pw);
        bw.write(qldb.hienThi2());
        bw.close();
    }

    private static void docFile() throws IOException {
        FileReader fr = new FileReader("contacts.csv");
        BufferedReader br = new BufferedReader(fr);
        String content;
        while ((content = br.readLine()) != null) {
            System.out.println(content + "\n");
        }
    }

    private static void timGanDung(QuanLy qldb, Scanner scl) {
        System.out.println("Nhap chuoi muon tim: ");
        String string = scl.nextLine();
        qldb.timGanDung(string);
    }

    private static void xoa(QuanLy qldb, Scanner scn) {
        String sdt;
        System.out.println("Nhap so dien thoai muon xoa: ");
        sdt = scn.nextLine();
        if (qldb.timBangSdt(sdt) == -1) {
            System.out.println("Không tìm được danh bạ với số điện thoại trên.");
        } else {
            qldb.xoa(sdt);
        }
        System.out.println("Xoa thanh cong");
        qldb.hienThi();
    }

    private static void them(QuanLy qldb, Scanner scl, Scanner scn) {
        System.out.print("Nhap so dien thoai: ");
        String sdt = scl.nextLine();
        System.out.println("Nhap nhom danh ba can them: ");
        String nhom = scl.nextLine();
        System.out.print("Nhap ten danh ba can them: ");
        String ten = scl.nextLine();
        System.out.println("Nhap gioi tinh: ");
        String gt = scl.nextLine();
        System.out.println("Nhap dia chi: ");
        String dc = scl.nextLine();
        System.out.println("Nhap ngay sinh: ");
        int ngay = scn.nextInt();
        System.out.println("Nhap thang sinh: ");
        int thang = scn.nextInt();
        System.out.println("Nhap nam sinh: ");
        int nam = scn.nextInt();
        System.out.println("Nhap Email: ");
        String email = scl.nextLine();
        qldb.them(new DanhBa(sdt, nhom, ten, gt, dc, LocalDate.of(nam, thang, ngay), email));
        System.out.println("Them thanh cong");
        qldb.hienThi();
    }

    private static void sua(QuanLy qldb, Scanner scl, Scanner scn) {
        String nhom;
        int ngay;
        String email;
        String gt;
        String dc;
        int nam;
        String ten;
        String sdt;
        int thang;
        System.out.println("Nhap so dien thoai muon sua: ");
        sdt = scl.nextLine();
        if (qldb.timBangSdt(sdt) == -1) {
            System.out.println("Không tìm được danh bạ với số điện thoại trên.");
        } else {
            System.out.println("Nhap nhom danh ba can them: ");
            nhom = scl.nextLine();
            System.out.print("Nhap ten danh ba can them: ");
            ten = scl.nextLine();
            System.out.println("Nhap gioi tinh: ");
            gt = scl.nextLine();
            System.out.println("Nhap dia chi: ");
            dc = scl.nextLine();
            System.out.println("Nhap ngay sinh: ");
            ngay = scn.nextInt();
            System.out.println("Nhap thang sinh: ");
            thang = scn.nextInt();
            System.out.println("Nhap nam sinh: ");
            nam = scn.nextInt();
            System.out.println("Nhap Email: ");
            email = scl.nextLine();
            qldb.sua(sdt, new DanhBa(sdt, nhom, ten, gt, dc, LocalDate.of(ngay, thang, nam), email));
            System.out.println("Sua thanh cong");
            qldb.hienThi();
        }
    }
}
