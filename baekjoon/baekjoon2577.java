package baekjoon;
import java.util.Scanner;
public class baekjoon2577 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = a * b * c;
            int cnt = 0;
            int cnt1 = 0;
            int cnt2 = 0;
            int cnt3 = 0;
            int cnt4 = 0;
            int cnt5 = 0;
            int cnt6 = 0;
            int cnt7 = 0;
            int cnt8 = 0;
            int cnt9 = 0;


            String str = Integer.toString(d);
            int[] num = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) =='0') {
                    cnt++;
                }
                if (str.charAt(i) =='1') {
                    cnt1++;
                }
                if (str.charAt(i) =='2') {
                    cnt2++;
                }
                if (str.charAt(i) =='3') {
                    cnt3++;
                }
                if (str.charAt(i) =='4') {
                    cnt4++;
                }
                if (str.charAt(i) =='5') {
                    cnt5++;
                }if (str.charAt(i) =='6') {
                    cnt6++;
                }
                if (str.charAt(i) =='7') {
                    cnt7++;
                }
                if (str.charAt(i) =='8') {
                    cnt8++;
                }if (str.charAt(i) =='9') {
                    cnt9++;
                }
            }
            System.out.println(cnt);
            System.out.println(cnt1);
            System.out.println(cnt2);
            System.out.println(cnt3);
            System.out.println(cnt4);
            System.out.println(cnt5);
            System.out.println(cnt6);
            System.out.println(cnt7);
            System.out.println(cnt8);
            System.out.println(cnt9);

        }

    }

