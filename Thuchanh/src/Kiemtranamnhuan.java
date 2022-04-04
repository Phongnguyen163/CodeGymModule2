import java.util.Scanner;

public class Kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Nhap nam: ");
        year = sc.nextInt();
        boolean namnhuan = false;
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0){
                    namnhuan = true;
                }
            } else {
                namnhuan = true;
            }
        }

        if(namnhuan){
            System.out.printf("%d la nam nhuan", year);
        } else {
            System.out.printf("%d khong phai nam nhuan", year);
        }
    }
}
