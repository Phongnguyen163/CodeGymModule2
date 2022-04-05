import java.util.Scanner;

public class Timmintrongmang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so luong phan tu mang: ");
            size = sc.nextInt();
        } while (size <= 0 );
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.printf("%-20s%s", "Mang da nhap: ", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.print("\n");
        int min = arr[0];
        for (int i = 0; i< arr.length; i++) {
            if (arr [i] < min) {
                min = arr[i];
            }
        }
        System.out.print("Phan tu nho nhat cua mang la: " + min);
    }
}
