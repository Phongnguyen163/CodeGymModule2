import java.util.Scanner;

public class Xoaphantumang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        int index_del;
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
        do {
            System.out.print("Nhap vi tri phan tu muon xoa: ");
            index_del = sc.nextInt();
            if (index_del < 0 || index_del >= arr.length) {
                System.out.println("So nhap khong hop le! Moi nhap lai!");
            }
            else {
                for (int i = index_del; i < arr.length-1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }
        while (index_del < 0 || index_del >= arr.length);
        System.out.printf("%-20s%s", "Mang sau khi xoa: ", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
