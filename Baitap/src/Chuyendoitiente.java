import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so USD: ");
        double USD = sc.nextDouble();
        double VND = USD * 23000;
        System.out.println("So tien VND duoc quy doi: " + VND);
    }
}
