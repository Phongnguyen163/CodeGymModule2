package QuanLyTinh;

import java.io.PrintStream;
import java.util.ArrayList;

public class QuanLyTinh implements QuanLy<Tinh>{
    ArrayList<Tinh> tinhList = new ArrayList();
    int sizeTinh = 1;

    public QuanLyTinh() {
    }

    public void khoiTao5Tinh() {
        this.tinhList.add(new Tinh(20, "Thai Nguyen", 20000L, 50000.0D));
        this.tinhList.add(new Tinh(29, "Ha Noi", 50000L, 50000.0D));
        this.tinhList.add(new Tinh(99, "Bac Ninh", 70000L, 50000.0D));
        this.tinhList.add(new Tinh(38, "Ha Tinh", 290000L, 50000.0D));
        this.tinhList.add(new Tinh(37, "Dak Lak", 10000L, 50000.0D));
    }

    public void add(Tinh tinh) {
        this.tinhList.add(tinh);
        ++this.sizeTinh;
    }

    public void addPerson() {
    }

    public void display() {

        for (Tinh tinh : this.tinhList) {
            System.out.println(tinh);
        }

    }

    public void display2() {

        for (Tinh tinh : this.tinhList) {
            PrintStream var10000 = System.out;
            int var10001 = tinh.getMa();
            var10000.println("Ma tinh: " + var10001 + ", Ten tinh: " + tinh.getTen());
        }

    }

    public void display3() {

        for (Tinh tinh : this.tinhList) {
            PrintStream var10000 = System.out;
            int var10001 = tinh.getMa();
            var10000.println("Ma tinh: " + var10001 + ", Ten tinh: " + tinh.getTen() + ", so nguoi la: " + tinh.getDanSo());
        }

    }

    public int search(String name) {
        for(int i = 0; i < this.tinhList.size(); ++i) {
            if (((Tinh)this.tinhList.get(i)).getTen().equals(name)) {
                System.out.println(name + " o vi tri " + i);
                return i;
            }
        }

        return -1;
    }

    public String searchNameByID(int id) {
        for (Tinh tinh : this.tinhList) {
            if (id == ((Tinh) tinh).getMa()) {
                String a = ((Tinh) tinh).getTen();
                return a;
            }
        }

        return "khong co";
    }

    public int searchidbyName(String name) {
        for (Tinh tinh : this.tinhList) {
            if (((Tinh) tinh).getTen().equals(name)) {
                return ((Tinh) tinh).getMa();
            }
        }

        return -1;
    }

    public void edit(String name, Tinh tinh) {
        int index = this.search(name);
        if (index != -1) {
            this.tinhList.set(index, tinh);
        } else {
            System.out.println("ko co");
        }

    }

    public void delete(String name) {
        this.search(name);
        this.tinhList.remove(this.search(name));
        System.out.println("da xoa thanh cong!");
    }

    public void setDanSo(String name) {

        for (Tinh tinh : this.tinhList) {
            if (tinh.getTen().equals(name)) {
                tinh.setDanSo(tinh.getDanSo() + 1L);
            }
        }

    }
}
