package p1912;

import java.util.Scanner;

public class p1912 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        boolean nFlag = true;
        int n = s.nextInt();
        if(n<1 || n>100000) return;
        int[] arr = new int[n];
        int[] dArr = new int[n];
        for(int i= 0;i<n;i++){
            arr[i] = s.nextInt();
            if(arr[i]<-1000 || arr[i]>1000) return;
        }
        int maxValue = -10000000;
        int maxSum = 0;
        int thisSum = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>0)    nFlag = false;
            else if(maxValue<arr[i])    maxValue = arr[i];
            thisSum += arr[i];
            if(maxSum<thisSum){
                maxSum = thisSum;
            }else if(thisSum<0){
                thisSum = 0;
            }
        }
        if(nFlag == true)    maxSum = maxValue;
        System.out.println(maxSum);
    }
}
