package QuanLyTuyenSinh;

public class SinhVien {
    private String id;
    private String name;
    private String diaChi;
    private int mucUuTien;
    private String khoiThi;

    public SinhVien() {
    }

    public SinhVien(String id, String name, String diaChi, int mucUuTien, String khoiThi) {
        this.id = id;
        this.name = name;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
        this.khoiThi = khoiThi;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(int mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    public String getKhoiThi() {
        return khoiThi;
    }

    public void setKhoiThi(String khoiThi) {
        this.khoiThi = khoiThi;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id='" + this.getId() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", diaChi='" + this.getDiaChi() + '\'' +
                ", mucUuTien='" + this.getMucUuTien() + '\'' +
                ", khoiThi='" + this.getKhoiThi() + '\'' +
                '}';
    }
}
