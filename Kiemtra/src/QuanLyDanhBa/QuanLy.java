package QuanLyDanhBa;

import java.util.ArrayList;

public class QuanLy {
    ArrayList<DanhBa> listDB = new ArrayList<>();

    public void them(DanhBa danhBa) {
        listDB.add(danhBa);
    }

    public void sua(String sdt, DanhBa danhBa ) {
        listDB.set(timBangSdt(sdt), danhBa);
    }

    public void xoa(String sdt) {
        listDB.remove(timBangSdt(sdt));
    }

    public void timGanDung(String string) {
        for (DanhBa danhBa : listDB) {
            if (danhBa.getSoDienThoai().contains(string)){
                System.out.println(danhBa);
            }
        }
    }

    public int timBangSdt(String sdt) {
        for (int i = 0; i < listDB.size(); i++) {
            if (listDB.get(i).getSoDienThoai().equals(sdt)) {
                return i;
            }
        }
        return -1;
    }

    public void hienThi() {
        for (DanhBa a : listDB) {
            System.out.println(a);
        }
    }

    public String hienThi2() {
        String str = "";
        for (DanhBa db : listDB) {
            str += db.getSoDienThoai() + "," + db.getNhom() + "," + db.getTen() + "," + db.getGioiTinh() +
                    "," + db.getDiaChi() + "," + db.getNgaySinh() + "," + db.getEmail() + "\n";
        }

        return str;
    }
}
