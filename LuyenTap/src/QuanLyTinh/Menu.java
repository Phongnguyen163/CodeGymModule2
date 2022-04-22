package QuanLyTinh;

import java.util.Scanner;

public class Menu {
    Scanner scn;
    Scanner scl;

    public Menu() {
        this.scn = new Scanner(System.in);
        this.scl = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("===========MENU===========");
        System.out.println("1.THEM");
        System.out.println("2.HIEN THI DANH SACH NGUOI");
        System.out.println("3.HIEN THI TINH VA DAN SO");
        System.out.println("0.THOAT");
    }

    public Nguoi addPerson(QuanLyTinh qlt) {
        System.out.print("Nhap ma nguoi can them: ");
        int ma = this.scn.nextInt();
        System.out.print("Nhap ten nguoi can: ");
        String ten = this.scl.nextLine();
        System.out.print("Nhap tuoi nguoi can them: ");
        int tuoi = this.scn.nextInt();
        qlt.display2();
        System.out.print("Nhap ma tinh cua nguoi can them: ");
        this.scn.nextLine();
        int maTinh = this.scn.nextInt();
        String tenTinh = qlt.searchNameByID(maTinh);
        qlt.setDanSo(tenTinh);
        return new Nguoi(ma, ten, tuoi, tenTinh);
    }
}
