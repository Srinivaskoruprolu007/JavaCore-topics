package Arrays;

import java.util.Arrays;

public class ReversingTheArray {
    public static void main(String[] args) {
        int[] array = {3,7,4,22,78,32};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }

    }
}
