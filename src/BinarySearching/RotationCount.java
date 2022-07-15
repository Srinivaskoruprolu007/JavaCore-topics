package BinarySearching;

public class RotationCount {
    public static void main(String[] args) {
        int[]arr = {4,6,8,0,2,3};
        System.out.println(count(arr));
    }
    static int count(int[]arr){
        int pivot = pivot(arr);
        if(pivot==-1){
            return 0;
        }
        else return pivot+1;
    }
    static int pivot(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(end>mid-1 && arr[mid]<arr[mid-1]){
                return mid-1;
            }else if (start<mid && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[start]>arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return -1;
    }
}