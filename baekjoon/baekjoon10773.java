package baekjoon;
import java.util.Scanner;
import java.util.Stack;
public class baekjoon10773 {
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Stack<Integer> stack = new Stack<>();
            int a = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < a; i++) {
                int b = sc.nextInt();
                if (b != 0) {
                    stack.push(b);
                } else if (b == 0) {
                    stack.pop();
                }
            }
            for(int c : stack) {
                sum += c;
            }
            System.out.println(sum);
        }
    }
}
