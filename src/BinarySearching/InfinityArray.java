package BinarySearching;

public class InfinityArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,12,34,56,78,89,90,134};
        int target = 3;
        System.out.println(ans(arr,target));
    }
//    here we're not using array length function, so we're doubling the size of the array to apply binary search at every time
    static int ans(int[]arr,int target){
        int start = 0;
        int end = 1;
        while (target>arr[end]){
            int temp = end+1;
            end = end+(end-start+1)*2;
            start = temp;
        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int[]arr,int target,int start,int end){
        while (start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else return mid;
        }
        return -1;
    }
}
