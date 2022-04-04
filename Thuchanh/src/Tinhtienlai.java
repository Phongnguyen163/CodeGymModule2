import java.util.Scanner;

public class Tinhtienlai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tien gui: ");
        double Tiengui = sc.nextDouble();
        System.out.println("Nhap thang gui: ");
        int Thanggui = sc.nextInt();
        System.out.println("Nhap lai suat: ");
        double LaiSuat = sc.nextDouble();
        double Tonglai = 0;
        for(int i = 0; i < Thanggui; i++){
            Tonglai += Tiengui * (LaiSuat/100)/12 * Thanggui;
        }
        System.out.println("Tong lai: " + Tonglai);
    }
}
