package study;

import java.util.ArrayList;
import java.util.Scanner;

public class stack {
        public static void main(String[] arg){
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> stack = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                stack.add(sc.nextInt());
            }
            printStack(stack);
            stack.remove(4);
            printStack(stack);
            printPeek(stack, 3);
            printIsEmpty(stack);
        }

        public static void printStack(ArrayList<Integer> stack) {
            System.out.println("Stack: " + stack);
        }
        public static void printPeek(ArrayList<Integer> stack, int index) {
            if (index >= 0 && index < stack.size()) {
                System.out.println("Peek: " + stack.get(index));
            } else {
                System.out.println("Invalid peek index!");
            }
        }
        public static void printIsEmpty(ArrayList<Integer> stack) {
            System.out.println("Is empty: " + stack.isEmpty());
        }
    }

