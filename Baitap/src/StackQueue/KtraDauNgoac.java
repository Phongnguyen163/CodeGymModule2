package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class KtraDauNgoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bt = sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < bt.length(); i++) {
            if (bt.charAt(i) == '(') {
                stack.push(i);
            } else if (bt.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }
        if (stack.empty()) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
