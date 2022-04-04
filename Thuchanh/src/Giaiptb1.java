import java.util.Scanner;

public class Giaiptb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else {
            System.out.println("Phuong trinh co nghiem: " + -b/a);
        }
    }
}
