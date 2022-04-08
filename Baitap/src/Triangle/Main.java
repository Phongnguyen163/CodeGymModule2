package Triangle;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cac canh cua tam giac: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.print("Nhap mau cua tam giac: ");
        String d = sc.next();
        Triangle triangle = new Triangle(a, b, c, d);
        System.out.println("Chu vi tam giac: "+triangle.getPerimeter());
        System.out.println("Dien tich tam giac: "+triangle.getArea());
        System.out.println(triangle.toString());
    }
}
