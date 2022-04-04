import java.util.Scanner;

public class In20songuyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int n = sc.nextInt();
        int count = 0;
        int N = 2 ;
        String text = "";
        while (count < n) {
            if (N == 2) {
                text = text + " " + N;
                N++;
                count++;
            }
            else {
                int c = 0;
                for (int i= 2; i < N; i++ ) {
                    if (N%i == 0) {
                        c++;
                        N++;
                        break;
                    }
                }
                if (c==0) {
                    text = text + " " + N;
                    N++;
                    count++;
                }
            }
        }
        System.out.println("Chuỗi số nguyên tố: " + text);
    }
}
