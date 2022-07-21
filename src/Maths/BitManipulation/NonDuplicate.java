package Maths.BitManipulation;
//find the non-duplicate element in a duplicate array

import java.util.Arrays;

public class NonDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,3,2,1};
        System.out.println(findNonDoop(arr)+" is the only non duplicate in "+ Arrays.toString(arr));
    }

    static int findNonDoop(int []arr){
        int start = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            start ^= arr[i];
        }
        return start;
    }
}
