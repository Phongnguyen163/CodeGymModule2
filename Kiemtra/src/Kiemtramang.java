import java.util.Scanner;

public class Kiemtramang {
    public static void main(String[] args) {
        int n;
        int[] arr;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so luong phan tu mang: ");
            n = sc.nextInt();
        } while (n <= 0 );
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.printf("%-20s%s", "Mang da nhap: ", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.print("\n");
        // Tổng các phần tử chẵn
        for (int i = 0; i< arr.length ; i++) {
            if (arr[i] %2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println("Tong cac phan tu chan trong mang: " + sum);
        //Tìm  a trong mảng
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        int vitri = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                vitri = i ;
                count ++;
            }
        }
        if (count == 0) {
            System.out.println("So da nhap khong co trong mang");
        }
        System.out.println("So da nhap nam o vi tri: " + vitri);
        //Xóa a khỏi mảng
        for (int i = vitri; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        System.out.printf("%-20s%s", "Mang sau khi xoa: ", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.print("\n");
        // Thêm b vào mảng
        int b;
        int [] newArr = new int [arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        do {
            System.out.print("Nhap vi tri phan tu muon them: ");
            b = sc.nextInt();
            System.out.print("Nhap phan tu muon them: ");
            int ele_add = sc.nextInt();
            if (b < 0 || b >= newArr.length) {
                System.out.println("So nhap khong hop le! Moi nhap lai!");
            }
            else {
                for (int i = arr.length; i > b ; i--) {
                    newArr[i] = arr[i-1];
                }
                newArr[b] = ele_add;
            }
            System.out.printf("%-20s%s", "Mang sau khi them: ", "");
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + "\t");
            }
        }
        while (b < 0 || b >= newArr.length);
    }
}
