package QuanLyTuyenSinh;

import java.util.ArrayList;

public class TuyenSinh {
    ArrayList<SinhVien> listSV = new ArrayList<>();

    public void themSV(SinhVien sinhvien) {
        listSV.add(sinhvien);
    }

    public void timTheoId(String id) {
        int count = 0;
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getId().equals(id)) {
                System.out.println(sinhVien);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Thi sinh khong co trong danh sach");
        }
    }

    public void thoat() {
        System.exit(0);
    }

    public void display() {
        for (SinhVien e: listSV) {
            System.out.println(e);
        }
    }
}
