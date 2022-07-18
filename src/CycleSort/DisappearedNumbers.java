package CycleSort;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int [] arr= {1,2,4,3,5,3,7,8};
        System.out.println(cyclicSort(arr));
    }

    static List<Integer> cyclicSort(int[]arr){
        int i =0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else i++;
        }
        List <Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!= j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
