package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }



    static void sort(int[]arr){
        for (int i = 0; i < arr.length ; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMax(arr,0,last);
            swap(arr,maxIndex,last);
        }

    }
    static int getMax(int[]arr, int start, int end){
        int max = start;
        for (int i = start; i <=end; i++) {
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[]arr,int first, int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
