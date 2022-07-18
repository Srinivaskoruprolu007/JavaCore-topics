package CycleSort;

import static CycleSort.CyclicSort.swap;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,4};
        System.out.println(duplicate(arr));
    }


    private static int duplicate(int[] arr){
        int i = 0;
        while (i< arr.length){
            if(arr[i]!= arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }else i++;
        }
        for (int j = 0; j <arr.length ; j++) {
            if(arr[j]!= j+1){
                return arr[j];
            }
        }
        return arr.length;
    }
}
