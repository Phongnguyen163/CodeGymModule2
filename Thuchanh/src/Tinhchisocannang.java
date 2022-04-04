import java.util.Scanner;

public class Tinhchisocannang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap can nang: ");
        double weight = sc.nextDouble();
        System.out.println("Nhap chieu cao: ");
        double height = sc.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        if (bmi < 18) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        }
        else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        }
        else if (bmi < 30.0) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        }
        else{
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}
