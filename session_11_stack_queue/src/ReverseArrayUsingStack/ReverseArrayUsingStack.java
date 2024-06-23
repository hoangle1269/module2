package ReverseArrayUsingStack;

import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Reverse the array using Stack
        reverseArray(array);

        System.out.println("\nReversed Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        // Push all elements of array into stack
        for (int num : array) {
            stack.push(num);
        }

        // Pop all elements from stack and put them back to the array
        int index = 0;
        while (!stack.isEmpty()) {
            array[index++] = stack.pop();
        }
    }
}
