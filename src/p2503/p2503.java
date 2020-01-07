package p2503;

import java.util.Scanner;

public class p2503 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 1 || n > 100) return;
        int[][] arr = new int[n][];
        int[] ansArr = new int[729];
        for(int i=0;i<729;i++){
            ansArr[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = new int[3];
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
            if(arr[i][1] == 0 && arr[i][2] == 0){
                eraseNum1(ansArr, arr[i][0]);
            }
        }
    }
    public static void eraseNum1(int[] ansArr, int n){
        int a = n/100;
        int b = (n%100)/10;
        int c = n%10;

        eraseNum2(ansArr, a);
        eraseNum2(ansArr, b);
        eraseNum2(ansArr, c);
    }
    public static void eraseNum2(int[] ansArr, int n) {

    }
}
