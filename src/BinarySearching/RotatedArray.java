package BinarySearching;

public class RotatedArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,0};
        int target = 3;
        System.out.println(searchInRotatedArray(num,target));

    }
    static int searchInRotatedArray(int[]arr,int target){
        int pivot = pivot(arr);
//        if pivot is not found that means the given array is not rotated array
        if(pivot==-1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(arr[0]<target){
            return binarySearch(arr,target,0,pivot-1);
        } else return binarySearch(arr, target, pivot + 1, arr.length - 1);


    }
    static int binarySearch(int[]arr,int target,int start,int end){
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

    static int pivot(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if(end>mid+1 && arr[mid]>arr[mid+1])
                return mid;
            else if (start<mid-1 && arr[mid]<arr[mid-1])
                return mid-1;
            else if (arr[start]>=arr[mid])
                end = mid-1;
            else if (arr[start]<arr[mid])
                start = mid +1;

        }
        return -1;
    }
}
