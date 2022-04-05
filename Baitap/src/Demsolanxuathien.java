import java.util.Scanner;

public class Demsolanxuathien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String a = sc.nextLine();
        System.out.print("Nhap ky tu can kiem tra: ");
        char b = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (b == a.charAt(i)) {
                count++;
            }
        }
        System.out.println("So lan xuat hien "+b+": "+count);
    }
}
