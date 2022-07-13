package BinarySearching;

public class Basic {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,8};
        int target = 2;
        System.out.println("The "+target+" is found at "+BinarySearch(arr,target));
    }
    static int BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length;
        int mid = (start+end)/2;
        for (int num:arr) {
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
