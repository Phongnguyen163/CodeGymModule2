import java.io.*;
import java.util.Scanner;

public class ExIOTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("inp.txt"));
        String[] ts = (sc.nextLine()).split(" ");
        double x;
        x = -Double.parseDouble(ts[1])/Double.parseDouble(ts[0]);
        int tong = 0;
        int tich = 1;
        int max = Integer.parseInt(ts[0]);
        int min = Integer.parseInt(ts[0]);
        for (String t : ts) {
            tong += Integer.parseInt(t);
            tich *= Integer.parseInt(t);
            if (Integer.parseInt(t) > max) {
                max = Integer.parseInt(t);
            }
            if (Integer.parseInt(t) < min) {
                min = Integer.parseInt(t);
            }
        }

        PrintWriter pw = new PrintWriter("rs.txt");
        pw.println("Nghiem cua phuong trinh: "+ x);
        pw.println("Tong cac phan tu: "+ tong);
        pw.println("Tich cac phan tu: "+tich);
        pw.println("Phan tu lon nhat: "+max);
        pw.println("Phan tu nho nhat: "+min);
        pw.close();
    }
}
