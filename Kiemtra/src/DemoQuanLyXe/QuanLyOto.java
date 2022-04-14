package DemoQuanLyXe;

import java.util.Arrays;

public class QuanLyOto implements QuanLy<Oto> {
    private Oto[] otos = new Oto[3];
    private int size = 0;
    @Override
    public void them(Oto oto) {
        otos[size] = oto;
        size++;
    }

    @Override
    public void sua(String name, Oto oto) {
        otos[timKiem(name)] = oto;
    }

    @Override
    public void xoa(String name) {
        for (int i = timKiem(name); i < otos.length -1; i++) {
            otos[i] = otos[i + 1];
        }
        otos[otos.length - 1] = null;
        Oto[] otos2 = new Oto[otos.length - 1];
        System.arraycopy(otos, 0, otos2, 0, otos.length-1);
        otos = otos2;
    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < otos.length; i++) {
            if (name.equals(otos[i].getTen())){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sapXep() {
        Arrays.sort(otos);
    }

    @Override
    public void print() {
        for (int i = 0; i < otos.length; i++) {
            System.out.println(otos[i]);
        }
        System.out.println("---------------------");
    }
}