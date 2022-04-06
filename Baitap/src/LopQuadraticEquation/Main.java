package LopQuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap he so b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap he so c: ");
        double c = sc.nextDouble();
        QuadraticEquation ptb2 = new QuadraticEquation(a, b, c);
        if (ptb2.getDiscriminant() < 0) {
            System.out.print("Phuong trinh vo nghiem.");
        }
        else if (ptb2.getDiscriminant()==0) {
            System.out.print("Phuong trinh co nghiem duy nhat: " + ptb2.getRoot1());
        }
        else {
            System.out.print("Phuong trinh co 2 nghiem: " + ptb2.getRoot1() + " va " + ptb2.getRoot2());
        }
    }
}
