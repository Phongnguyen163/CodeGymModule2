public class InsertionSort {
    public static int[] array = {5, 9, 55, 99, 15, 23, 30, 57, 61, 41};

    public static void insertionSort(int[] array) {
        int arrayLength = array.length;
        int temp, j;
        for (int i = 1; i < arrayLength; i++) {
            temp = array[i];
            j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("Before: ");
        for (int elements : array){
            System.out.print(elements+" ");
        }

        System.out.println("\nAfter: ");
        insertionSort(array);
        for (int elements : array){
            System.out.print(elements+" ");
        }
    }
}
