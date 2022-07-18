package CycleSort;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicates {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(AllDoops(nums));
    }


    private static List<Integer> AllDoops(int[] arr){
        int i =0;
        while(i< arr.length){
            if(arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }else i++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j <arr.length ; j++) {
            if(arr[j]!=j+1){
                ans.add(arr[j]);
            }
        }
        return ans;
    }
    private static void swap(int[]arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
