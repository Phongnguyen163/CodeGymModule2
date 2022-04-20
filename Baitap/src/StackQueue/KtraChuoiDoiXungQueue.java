package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class KtraChuoiDoiXungQueue {
    public static void main(String[] args) {
        String str = "adda";
        StringBuilder result = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();

        for (int i = str.length()-1; i >=0; i--) {
            queue.add(str.charAt(i));
        }

        while (!queue.isEmpty()) {
            result.append(queue.remove());
        }

        if (str.equals(result.toString())){
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}
