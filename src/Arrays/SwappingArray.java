package Arrays;

import java.util.Arrays;

public class SwappingArray {
    public static void main(String[] args) {
        int[] arr = {1,57,6,8,4,7};
        swap(arr,2,5);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[]arr,int index1, int index2 ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
