package StackQueue;

import java.util.Stack;

public class KtraChuoiDoiXungStack {
    public static void main(String[] args) {
        String str = "radar";
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        if (str.contentEquals(result)){
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}
