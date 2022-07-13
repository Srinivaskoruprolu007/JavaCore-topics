package BinarySearching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 8;
        System.out.println("The target element "+target+" is found at "+binarySearch(arr,target));

    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
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
