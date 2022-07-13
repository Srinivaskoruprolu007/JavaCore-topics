package BinarySearching;

public class Basic {
//    binary search works for only sorted arrays
//    here the steps to take the algo
//    Step 1: find middle element
//    step 2 : if element at middle is larger than our target it
//     initiated to left side else right side of the array
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,8};
        int target = 1;
        System.out.println("The "+target+" is found at "+BinarySearch(arr,target));
    }
    static int BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        for (int ignored :arr) {
            if(arr[mid]>target){
                mid = (start+mid)/2;
            } else if (arr[mid]<target) {
                mid = (mid+end)/2;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
/*
* Why Binary search?......
* It is a optimal solution than linear search
* time complexity is O(NLogN)* */
