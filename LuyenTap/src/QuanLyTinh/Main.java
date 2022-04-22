package QuanLyTinh;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        QuanLyNguoi qln = new QuanLyNguoi();
        QuanLyTinh qlt = new QuanLyTinh();
        qlt.khoiTao5Tinh();
        Scanner scn = new Scanner(System.in);
        Scanner scl = new Scanner(System.in);

        int choice;
        do {
            menu.menu();
            System.out.print("Nhap lua chon cua ban: ");
            choice = scn.nextInt();
            String check;
            switch(choice) {
                case 1:
                    do {
                        qln.add(menu.addPerson(qlt));

                        do {
                            System.out.print("Ban co muon de them khong (y/n): ");
                            check = scl.nextLine().toLowerCase();
                        } while(!check.equals("n") && !check.equals("y"));
                    } while(!check.equals("n"));
                    break;
                case 2:
                    System.out.println("Hien thi danh sach nguoi:");
                    qln.display();
                    break;
                case 3:
                    qlt.display3();
            }
        } while(choice != 0);
    }
}
