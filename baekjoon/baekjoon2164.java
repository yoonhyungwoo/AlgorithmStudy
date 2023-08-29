package baekjoon;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class baekjoon2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= x; i++) {
            deque.offerFirst(i);
        }

        while (true) {
            if(deque.size() == 1){
                break;
            }
            deque.pollLast();
            deque.offerFirst(deque.pollLast());
        }
        System.out.println(deque.peek());
    }
}

