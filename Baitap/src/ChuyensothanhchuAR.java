import java.util.Scanner;

public class ChuyensothanhchuAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so = sc.nextInt();
        String[] arr = {"không","một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười"};
        String chuoi = null;
        if (so >= 0 && so <= 10) {
            chuoi = arr[so];
        }
        if (so > 10 && so <= 19) {
            if (so%10 != 5) {
                chuoi = "mười "+ arr[so%10];
            }
            else {
                chuoi = "mười" + " lăm ";
            }
        }
        if (so >= 20 && so <100) {
            if (so%10 == 0) {
                chuoi = arr[so/10] + " mươi ";
            }
            else if (so%10 == 1) {
                chuoi = arr[so/10] + " mươi mốt";
            }
            else if (so%10 == 5) {
                chuoi = arr[so/10] + " mươi lăm";
            }
            else {
                chuoi = arr[so/10] + " mươi " + arr[so%10];
            }
        }
        System.out.println(chuoi);
    }
}
