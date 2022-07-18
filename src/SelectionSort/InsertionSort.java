package SelectionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[]arr = {5,3,4,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0; j--) {
                if(arr[i]>arr[j]){
                    swap(arr,arr[i],arr[j]);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
