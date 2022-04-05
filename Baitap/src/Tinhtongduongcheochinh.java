public class Tinhtongduongcheochinh {
    public static void main(String[] args) {
        int [][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum = 0;
        for (int i = 0; i<array.length; i++) {
            sum = sum + array[i][i];
        }
        System.out.print("Tong duong cheo chinh la: " + sum);
    }
}
