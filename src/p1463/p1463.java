package p1463;

import java.util.Scanner;

import static java.lang.Math.pow;

public class p1463 {
    private static int[] arr;
    private static final int MAX_INT = 10000000;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 1 || n > pow(10, 6)) {
            return;
        }
        arr = new int[n + 1];
        int result = makeOne(n);
        System.out.println(result);
    }

    public static int makeOne(int n) {
        int a, b, c;
        arr[0] = 0;
        arr[1] = 0;
        for (int i = 2; i <= n; i++) {
            if (i % 3 == 0) {
                a = arr[i / 3] + 1;
            } else a = MAX_INT;
            if (i % 2 == 0) {
                b = arr[i / 2] + 1;
            } else b = MAX_INT;
            if (true) {
                c = arr[i - 1] + 1;
            } else c = MAX_INT;
            arr[i] = min3(a, b, c);
        }
        return arr[n];
    }

    public static int min3(int a, int b, int c) {
        if (a <= b && a <= c) return a;
        else if (b <= a && b <= c) return b;
        else return c;
    }
}
