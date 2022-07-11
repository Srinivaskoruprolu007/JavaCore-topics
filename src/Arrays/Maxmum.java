package Arrays;

import java.util.Enumeration;

public class Maxmum {
    public static void main(String[] args) {
        int[] arr = {3,6,73,6,3,8};
        max(arr);
        maxRange(arr,3,5);
    }
    static void max(int[]arr){
        if (arr.length==0){
            return;
        }
        if(arr==null){
            return;
        }
        int max = Integer.MIN_VALUE;
        for (int num:arr) {
            if(num>max){
                max=num;
            }
        }
        System.out.println(max);
    }
    static void maxRange(int[]arr,int start, int last){
        if(start>last){
            return;
        }
        if (arr== null){
            return;
        }
        int max = arr[start];
        for (int i = start; i <=last ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
