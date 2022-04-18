package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class DaoMang {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        System.out.print("Mang ban dau: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            arr[i] = stack.pop() ;
        }
        System.out.print("Mang sau khi dao: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
