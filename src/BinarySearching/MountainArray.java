package BinarySearching;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,3,2,1,0};
        System.out.println(IndexInMountainArray(arr));

    }
    static int IndexInMountainArray(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
//                you're at ascending ordered part
                start = mid+1;
            } else if (arr[mid]>arr[mid+1]) {
//                you are at descending ordered part
                end = mid;
            }
        }
        return start;
    }
}
