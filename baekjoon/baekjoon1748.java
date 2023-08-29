package baekjoon;
import java.util.Scanner;
public class baekjoon1748 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int cnt = 0;
            for(int i = 1; i <= N; i ++){
                if(i < 10){
                    cnt++;
                }
                if(10 <= i && i < 100){
                    cnt = cnt + 2;
                }
                if(100 <= i && i < 1000){
                    cnt = cnt + 3;
                }
                if(1000 <= i && i < 10000){
                    cnt = cnt + 4;
                }
                if(10000 <= i && i < 100000){
                    cnt = cnt + 5;
                }
                if(100000 <= i && i < 1000000){
                    cnt = cnt + 6;
                }
                if(1000000 <= i && i < 10000000){
                    cnt = cnt + 7;
                }
                if(10000000 <= i && i < 100000000){
                    cnt = cnt + 8;
                }
                if(i == 100000000){
                    cnt = cnt + 9;
                }
            }

            System.out.println(cnt);
        }
    }

