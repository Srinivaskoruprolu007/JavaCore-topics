package Searching;

public class SearchInRange {
    static int search(int[]arr,int start,int end,int target) {
        if (arr == null) return -1;
        int i;
        for (i = start; i <= end; i++) {
            if (target == arr[i]) {
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int []arr = {3,5,4,5,6,2,4,8};
        System.out.println(search(arr,2,5,6));
    }
}
