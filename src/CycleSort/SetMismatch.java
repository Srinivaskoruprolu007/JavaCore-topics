package CycleSort;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,2,6,5};
        System.out.println(Arrays.toString(mismatch(arr)));
    }
    static int[] mismatch(int[] arr){
        int i =0;
        while (i < arr.length){
            if(arr[i] != arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                return new int[]{arr[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }



    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
