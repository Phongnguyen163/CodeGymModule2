package Demo;

public class QuanLySinhVien {
    private SinhVien[] sinhViens;

    public QuanLySinhVien() {
    }

    public QuanLySinhVien(SinhVien[] sinhViens) {
        this.sinhViens = sinhViens;
    }

    public void add(SinhVien sinhVien) {}

    public void update(SinhVien sinhVien, int viTri) {}

    public void delete(int viTri) {}

    public SinhVien find(String name) {
        return new SinhVien();
    }
}
