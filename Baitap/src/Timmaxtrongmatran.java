public class Timmaxtrongmatran {
    public static void main(String[] args) {
        int [][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        double Max = array[0][0];
        int a, b;
        for (int i= 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > Max) {
                    Max = array[i][j];
                }
            }
        }
    }
}
