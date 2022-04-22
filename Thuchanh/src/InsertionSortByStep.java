import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Before: ");
        for (int elements : list){
            System.out.print(elements+" ");
        }

        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }

    public static void insertionSortByStep(int[] list) {
        int arrayLength = list.length;
        int temp, j;
        for (int i = 1; i < arrayLength; i++) {
            temp = list[i];
            j = i - 1;

            while (j >= 0 && list[j] > temp) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = temp;
        }

        System.out.println("\nAfter: ");
        for (int elements : list){
            System.out.print(elements+" ");
        }
    }
}
