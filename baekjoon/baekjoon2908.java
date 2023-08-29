package baekjoon;
import java.util.Scanner;
public class baekjoon2908 {
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int num1 = ((a % 10) * 100) + (a / 100) + (((a % 100) / 10) * 10);
            int num2 = ((b % 10) * 100) + (b / 100) + (((b % 100) / 10) * 10);

            System.out.println(Math.max(num1, num2));
        }
    }
}
