package baekjoon;
import java.util.Scanner;
public class baekjoon1110 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a =sc.nextInt();
            int b = a;
            int cnt = 0;
            while(true){
                a = ((a%10)*10) + (((a/10)+(a%10))%10);
                cnt++;
                if(b == a){
                    break;
                }
            }
            System.out.println(cnt);
        }

    }
