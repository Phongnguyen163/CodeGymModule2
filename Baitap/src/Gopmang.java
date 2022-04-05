import java.util.Scanner;

public class Gopmang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int length = array1.length + array2.length;
        int[] result = new int[length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        System.out.printf("%-20s%s", "Mang sau khi gop: ", "");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\t");
        }
    }
}
