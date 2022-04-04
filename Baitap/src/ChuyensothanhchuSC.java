import java.util.Scanner;

public class ChuyensothanhchuSC {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String string = null;
        if (num >= 0 && num <= 10) {
            string = ChuyensothanhchuSC.Chuoi(num);
        }
        if (num > 10 && num <= 19) {
            if (num%10 != 5) {
                string = "mười "+ ChuyensothanhchuSC.Chuoi(num%10);
            }
            else {
                string = "mười" + " lăm ";
            }
        }
        if (num >= 20 && num <100) {
            if (num%10 == 0) {
                string = ChuyensothanhchuSC.Chuoi(num/10) + " mươi ";
            }
            else if (num%10 == 5) {
                string = ChuyensothanhchuSC.Chuoi(num/10) + " mươi lăm";
            }
            else {
                string = ChuyensothanhchuSC.Chuoi(num/10) + " mươi " + ChuyensothanhchuSC.Chuoi(num%10);
            }
        }
        System.out.println(string);
    }

    public static String Chuoi (int number) {
        String string = null;
        switch (number) {
            case 0:
                string ="không";
                break;
            case 1:
                string ="một";
                break;
            case 2:
                string ="hai";
                break;
            case 3:
                string ="ba";
                break;
            case 4:
                string ="bốn";
                break;
            case 5:
                string ="năm";
                break;
            case 6:
                string ="sáu";
                break;
            case 7:
                string ="bảy";
                break;
            case 8:
                string ="tám";
                break;
            case 9:
                string ="chín";
                break;
            case 10:
                string ="mười";
                break;
        }
        return string;
    }
}
