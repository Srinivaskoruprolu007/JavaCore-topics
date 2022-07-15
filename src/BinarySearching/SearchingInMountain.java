package BinarySearching;

public class SearchingInMountain {
    public static void main(String[] args) {
        int[] arr = {0,3,4,3,1,0};
        int target = 0;
        System.out.println(ans(arr,target));

    }
    static int ans(int[]arr,int target){
        int peak = IndexInMountainArray(arr);
        int firstTry = binarySearch( arr, target,0,peak );
        if(firstTry!=-1){
            return firstTry;
        }
        else return binarySearch(arr,target,peak+1,arr.length-1);
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
    static int binarySearch(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid = start+(end-start)/2;
            if(isAcen(arr)){
                for (int ignored :arr) {
                    if(target>arr[mid]){
                        mid++;
                    } else if (target<arr[mid]) {
                        mid--;
                    }
                }
            }
            else {
                for (int ignored :arr) {
                    if(target>arr[mid]){
                        mid--;
                    } else if (target<arr[mid]) {
                        mid++;
                    }
                }
            }
            if (arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }
    static boolean isAcen(int[]arr){
        int start = 0;
        int end = arr.length;
        return end > start;
    }
}
