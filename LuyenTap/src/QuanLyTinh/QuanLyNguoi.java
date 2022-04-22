package QuanLyTinh;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNguoi implements QuanLy<Nguoi>{
    List<Nguoi> nguoiList = new ArrayList();
    List<QuanLyTinh> quanLiTinhs = new ArrayList();

    public QuanLyNguoi() {
    }

    public void add(Nguoi nguoi) {
        this.nguoiList.add(nguoi);
    }

    public void display() {
        for(int i = 0; i < this.nguoiList.size(); ++i) {
            System.out.println(this.nguoiList.get(i));
        }

    }

    public int search(String name) {
        for(int i = 0; i < this.nguoiList.size(); ++i) {
            if (((Nguoi)this.nguoiList.get(i)).getTen().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    public void edit(String name, Nguoi nguoi) {
        int index = this.search(name);
        if (index != -1) {
            this.nguoiList.set(index, nguoi);
        } else {
            System.out.println("ko co");
        }

    }

    public void delete(String name) {
        this.search(name);
        this.nguoiList.remove(this.search(name));
        System.out.println("da xoa thanh cong!");
    }
}
