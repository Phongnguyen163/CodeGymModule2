package QuanLyDanhBa;

import java.time.LocalDate;

public class DanhBa {
    private String soDienThoai;
    private String nhom;
    private String ten;
    private String gioiTinh;
    private String diaChi;
    private LocalDate ngaySinh;
    private String Email;

    public DanhBa() {
    }

    public DanhBa(String soDienThoai, String nhom, String ten, String gioiTinh, String diaChi, LocalDate ngaySinh, String email) {
        this.soDienThoai = soDienThoai;
        this.nhom = nhom;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        Email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "DanhBa{" +
                "soDienThoai=" + soDienThoai +
                ", nhom='" + nhom + '\'' +
                ", name='" + ten + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
