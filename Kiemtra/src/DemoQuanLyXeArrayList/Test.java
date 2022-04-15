package DemoQuanLyXeArrayList;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        QuanLyUsers qlus = new QuanLyUsers();
        int choice;

        do {
            System.out.println("Nhap lua chon cua ban: ");
            System.out.println("1. Dang nhap");
            System.out.println("2. Dang ky");
            System.out.println("0.Cut");
            choice = sc.nextInt();
            if (choice == 1) {
                boolean checkDN;
                do {
                    System.out.print("Nhập tên đăng nhập: ");
                    String usn = scanner.nextLine();
                    System.out.print("Nhập mật khẩu: ");
                    String pw = scanner.nextLine();
                    checkDN = qlus.kiemTraDangNhap(usn, pw);
                    if (checkDN) {
                        QuanLyPhuongTien qlpt = new QuanLyPhuongTien();
                        XeMay xm1 = new XeMay("Honda", "Đen", "adv", 120, 300);
                        XeMay xm2 = new XeMay("Honda", "Đỏ", "asv", 180, 300);
                        XeMay xm3 = new XeMay("Honda", "Đỏ Đen", "awv", 150, 300);
                        Oto oto1 = new Oto("Honda", "Đen", "ada", 165, 656);
                        Oto oto2 = new Oto("Ford", "Đen", "sdv", 6416, 6199);
                        Oto oto3 = new Oto("Lamborghini", "Đen", "dvg", 841, 6552);

                        qlpt.them(xm1);
                        qlpt.them(xm2);
                        qlpt.them(xm3);
                        qlpt.them(oto1);
                        qlpt.them(oto2);
                        qlpt.them(oto3);
                        qlpt.print();

                        do {
                            System.out.println("Lua chon phuong thuc: ");
                            System.out.println("1.Them xe");
                            System.out.println("2.Sua xe");
                            System.out.println("3.Xoa xe");
                            System.out.println("4.Tim xe");
                            System.out.println("0.Thoat");
                            System.out.println("--------------------");
                            choice = sc.nextInt();
                            if (choice == 1) {
                                do {
                                    System.out.println("Nhap loai xe muon them: ");
                                    System.out.println("1. Xe May");
                                    System.out.println("2. Oto");
                                    System.out.println("0. Quay lai");
                                    System.out.println("--------------------");
                                    choice = sc.nextInt();
                                    if (choice == 1) {
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
                                        qlpt.them(xm4);
                                        qlpt.print();
                                    }
                                    if (choice == 2) {
                                        System.out.println("Nhap thong tin xe muon them");
                                        System.out.print("Hang: ");
                                        String hang = sc.next();
                                        System.out.print("Ten: ");
                                        String ten = sc.next();
                                        System.out.print("Mau: ");
                                        String mau = sc.next();
                                        System.out.print("Gia: ");
                                        int gia = sc.nextInt();
                                        System.out.print("Cho Ngoi: ");
                                        int choNgoi = sc.nextInt();
                                        Oto oto4 = new Oto();
                                        oto4.setHang(hang);
                                        oto4.setTen(ten);
                                        oto4.setMau(mau);
                                        oto4.setGia(gia);
                                        oto4.setChoNgoi(choNgoi);
                                        qlpt.them(oto4);
                                        qlpt.print();
                                    }
                                    if (choice == 0) {
                                        break;
                                    }
                                }
                                while (choice > 0 && choice < 3);
                            } else if (choice == 2) {
                                do {
                                    System.out.println("Nhap loai xe muon sua: ");
                                    System.out.println("1. Xe May");
                                    System.out.println("2. Oto");
                                    System.out.println("0. Quay lai");
                                    System.out.println("--------------------");
                                    choice = sc.nextInt();
                                    if (choice == 1) {
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
                                        qlpt.sua(ten,xm4);
                                        qlpt.print();
                                    }
                                    if (choice == 2) {
                                        System.out.println("Nhap thong tin xe muon sua");
                                        System.out.print("Hang: ");
                                        String hang = sc.next();
                                        System.out.print("Ten: ");
                                        String ten = sc.next();
                                        System.out.print("Mau: ");
                                        String mau = sc.next();
                                        System.out.print("Gia: ");
                                        int gia = sc.nextInt();
                                        System.out.print("Cho Ngoi: ");
                                        int choNgoi = sc.nextInt();
                                        Oto oto4 = new Oto();
                                        oto4.setHang(hang);
                                        oto4.setTen(ten);
                                        oto4.setMau(mau);
                                        oto4.setGia(gia);
                                        oto4.setChoNgoi(choNgoi);
                                        qlpt.sua(ten, oto4);
                                        qlpt.print();
                                    }
                                    if (choice == 0) {
                                        break;
                                    }
                                }
                                while (choice > 0 && choice < 3);
                            } else if (choice == 3) {
                                System.out.print("Nhap ten xe muon xoa: ");
                                String ten = sc.next();
                                qlpt.xoa(ten);
                                qlpt.print();
                            } else if (choice == 4) {
                                System.out.print("Nhap ten xe muon tim: ");
                                String ten = sc.next();
                                System.out.println(qlpt.timKiem(ten));
                            }
                        }
                        while (choice > 0 && choice < 5);
                    } else {
                        System.out.println("Sai tên đăng nhập hoặc mật khẩu");
                        break;
                    }
                } while (!checkDN);
            }
            if (choice == 2) {
                boolean checkDK;
                do {
                    System.out.print("Nhập tên đăng nhập: ");
                    String usn = scanner.nextLine();
                    System.out.print("Nhập mật khẩu: ");
                    String pw = scanner.nextLine();
                    checkDK = qlus.kiemTraDangKy(usn, pw);
                    if (!checkDK) {
                        System.out.println("Tên dang nhap nay đa ton tai");
                        break;
                    }
                    else {
                        System.out.println("Dang ky thanh cong");
                    }
                } while (!checkDK);
            }
        }
        while (choice != 0);
    }
}
