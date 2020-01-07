package p1018;

import java.util.Scanner;

import static java.lang.Integer.min;

public class p1018 {
    public static char[][] arr;
    public static final char[][] ansArr1 = {
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
    };
    public static final char[][] ansArr2 = {
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
    };


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int result = 0;
        if (m < 8 || m > 50) return;
        if (n < 8 || n > 50) return;
        arr = new char[m][n];
        s.nextLine();
        for (int i = 0; i < m; i++) {
            String line = s.nextLine();
            if (line.length() < 8) return;
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j);
                if (arr[i][j] != 'W' && arr[i][j] != 'B') return;
            }
        }
        result = chessBoard(0, 0);
        for(int i=0;i<m-7;i++){
            for(int j=0;j<n-7;j++){
                int tmp = chessBoard(i, j);
                if(tmp < result){
                    result = tmp;
                }
            }
        }
        System.out.println(result);
    }

    public static int chessBoard(int row, int col) {
        int result1 = 0, result2 = 0;
        for (int i = row; i < row + 8; i++) {
            for (int j = col; j < col + 8; j++) {
                if(arr[i][j] != ansArr1[i-row][j-col]) result1 ++;
                if(arr[i][j] != ansArr2[i-row][j-col]) result2 ++;
            }
        }

        return min(result1, result2);
    }
}
