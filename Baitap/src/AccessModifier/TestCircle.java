package AccessModifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        double radius = sc.nextDouble();
        Circle crl1 = new Circle(radius);
        System.out.println("Dien tich hinh tron co ban kinh: "+ crl1.getRadius() +" la: "+ crl1.getArea());
    }
}
