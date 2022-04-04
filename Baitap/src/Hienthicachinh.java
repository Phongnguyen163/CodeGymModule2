import java.util.Scanner;

public class Hienthicachinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++ ) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5 - i; j <= 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    for (int i = 0; i < 5; i++) {
                        for (int j = i; j < 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                case 3:
                    for(int i = 1; i <= 5; i++) {
                        for(int j = 1; j <= 5-i; j++) {
                            System.out.print("  ");
                        }
                        for(int k = 1; k <= 2*i-1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
