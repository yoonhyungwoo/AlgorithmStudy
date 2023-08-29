package baekjoon;
import java.util.Scanner;
public class baekjoon1924 {
    public static void main(String[] args) {
        String[] day = new String[7];
        day[0] = "SUN";
        day[1] = "MON";
        day[2] = "TUE";
        day[3] = "WED";
        day[4] = "THU";
        day[5] = "FRI";
        day[6] = "SAT";

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < x; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                sum += 31;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                sum += 30;
            } else if (i == 2) {
                sum += 28;
            }
        }
        sum = sum + y;
        System.out.println(day[sum % 7]);
    }

}
