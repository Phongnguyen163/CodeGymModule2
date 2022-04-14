package DemoQuanLyXeArrayList;

import java.util.ArrayList;
import java.util.List;

public class QuanLyPhuongTien implements QuanLy<PhuongTien> {
    List<PhuongTien> list = new ArrayList<>();

    @Override
    public void them(PhuongTien phuongTien) {
        list.add(phuongTien);
    }

    @Override
    public void sua(String name, PhuongTien phuongTien) {
        list.set(timKiem(name), phuongTien);
    }

    @Override
    public void xoa(String name) {
        list.remove(timKiem(name));
    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < list.size(); i ++) {
            if (list.get(i).getTen().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sapXep() {

    }

    @Override
    public void print() {
        for (PhuongTien e : list) {
            System.out.println(e);
        }
    }
}
