package study;
import java.util.Scanner;

public class bubblesort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean change;

        for (int i = 0; i < n - 1; i++) {
            change = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int num = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = num;
                    change = true;
                }
            }
            if (!change)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n크기 입력: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("n값들 입력:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        bubbleSort(arr);

        System.out.println("정렬 값: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}