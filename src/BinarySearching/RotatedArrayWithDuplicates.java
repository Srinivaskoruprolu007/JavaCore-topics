package BinarySearching;


public class RotatedArrayWithDuplicates {
    public static void main(String[] args) {
        int[]arr = {1,2,4,5,0,1};
        int target = 4;
        System.out.println(pivotWithDuplicates(arr));
        System.out.println(result(arr,target));
    }

    static int result(int[]arr,int target){
        int pivot = pivotWithDuplicates(arr);
        if(pivot==-1){
            return binarySearch(arr,target,0, arr.length-1);
        }
        if (arr[pivot]==target){
            return pivot;
        }
        if(arr[0]<target){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }


    static int binarySearch(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            if(arr[mid]<target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }


    static int pivotWithDuplicates(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]==arr[start]&&arr[mid]==arr[end]){
//                skip the duplicates
//                note: what if elements at start and end were pivot
//                check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
               }
                start++;

//                check whether end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
//left side is sorted so pivot should be in right
            else if (arr[start]<arr[mid]||(arr[start]==arr[mid]&& arr[mid]>arr[end])){
                start = mid+1;
            }
        }
        return -1;
    }
}
