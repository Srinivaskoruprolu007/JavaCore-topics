package BinarySearching;

public class Ceiling {
//    Ceiling means returning the nearest greater element
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,8};
        int target = 9;
        System.out.println("The "+target+" is found at "+BinarySearch(arr,target));
    }
    static int BinarySearch(int[] arr,int target){
        if (target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                end=mid-1;
            } else if (arr[mid] < target) {
                start=mid+1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
/*
* Why Binary search?......
* It is a optimal solution than linear search
* time complexity is O(NLogN)* */
