import java.util.Scanner;

public class Tinhtong1cot {
    public static void main(String[] args) {
        int [][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cot: ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i][a];
        }
        System.out.print("Tong cac phan tu cot "+(a+1)+" la: " + sum);
    }
}
