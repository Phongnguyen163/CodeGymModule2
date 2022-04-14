package DemoQuanLyXe;

import java.util.Arrays;

public class QuanLyXeMay implements QuanLy<XeMay> {
    private XeMay[] xeMays = new XeMay[3];
    private int size = 0;
    @Override
    public void them(XeMay xeMay) {
        xeMays[size] = xeMay;
        size++;
    }

    @Override
    public void sua(String name, XeMay xeMay) {
        xeMays[timKiem(name)] = xeMay;
    }

    @Override
    public void xoa(String name) {
        for (int i = timKiem(name); i < xeMays.length -1; i++) {
            xeMays[i] = xeMays[i + 1];
        }
        xeMays[xeMays.length - 1] = null;
        XeMay[] xeMays2 = new XeMay[xeMays.length - 1];
        System.arraycopy(xeMays, 0, xeMays2, 0, xeMays.length-1);
        xeMays = xeMays2;
    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < xeMays.length; i++) {
            if (name.equals(xeMays[i].getTen())){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sapXep() {
        Arrays.sort(xeMays);
    }

    @Override
    public void print() {
        for (XeMay xeMay : xeMays) {
            System.out.println(xeMay);
        }
        System.out.println("---------------------");
    }
}
