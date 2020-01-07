package p1182;

import java.util.Scanner;

import static java.lang.Math.pow;

public class p1182 {
    private static Scanner scanner = new Scanner(System.in);
    private static final int n = scanner.nextInt();
    private static final int s = scanner.nextInt();
    private static int[] arr = new int[n];
    public static int result = 0;
    public static int countZero = 0;

    public static void main(String[] args) {
        if (n < 1 || n > 20) return;
        if (s < -1000000 || s > 1000000) return;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > 100000 || arr[i] < -100000) return;
        }
        dfs(0, 0);
        System.out.println(result);
    }

    public static void dfs(int index, int sum) {
        if(index>=n) return;
        sum += arr[index];
        if(sum == s) result++;
        dfs(index+1, sum - arr[index]);
        dfs(index+1, sum);
    }
}
