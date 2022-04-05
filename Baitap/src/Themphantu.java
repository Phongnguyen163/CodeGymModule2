import java.util.Scanner;

public class Themphantu {
    public static void main(String[] args) {
        int size;
        int[] arr;
        int index_add;
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
        int [] tempArr = new int [arr.length + 1];
        System.arraycopy(arr, 0, tempArr, 0, arr.length);
        do {
            System.out.print("Nhap vi tri phan tu muon them: ");
            index_add = sc.nextInt();
            System.out.print("Nhap phan tu muon them: ");
            int ele_add = sc.nextInt();
            if (index_add < 0 || index_add >= tempArr.length) {
                System.out.println("So nhap khong hop le! Moi nhap lai!");
            }
            else {
                for (int i = arr.length; i > index_add ; i--) {
                    tempArr[i] = arr[i-1];
                }
                tempArr[index_add] = ele_add;
            }
            System.out.printf("%-20s%s", "Mang sau khi them: ", "");
            for (int i = 0; i < tempArr.length; i++) {
                    System.out.print(tempArr[i] + "\t");
            }
        }
        while (index_add < 0 || index_add >= tempArr.length);
    }
}
