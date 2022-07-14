package BinarySearching;

public class FloorOfANumber {
//    floor of number return the number which nearest smaller number
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,90};
        int target = 0;
        System.out.println(floor(arr,target));
        }
    static int floor(int[]arr,int target){
        if(target<arr[0]){
            return -1;
        }
            int start = 0;
            int end = arr.length-1;
            while (end>=start){
                int mid = start+(end-start)/2;
                if(arr[mid]<target){
                    start = mid+1;
                } else if (arr[mid]>target) {
                    end = mid-1;
                }
                else{
                    return arr[mid];
                }
            }return arr[end];
    }
}
