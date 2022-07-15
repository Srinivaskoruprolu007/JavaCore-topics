package BinarySearching;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int m = 2;
        System.out.println(splitArray(arr,m));
    }
    static int splitArray(int[]num,int m){
        int start = 0;
        int end = 0;
        for (int j : num) {
            start = Math.max(start, j);
            end += j;
        }
        while(start<end){
//            try for the middle as potential answer
            int mid = start+(end-start)/2;
//            calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int nums:num) {
                if((sum+nums)>mid){
//                    you can't add this SubArray , make this new sub
                    sum = nums;
                    pieces++;
                }else {
                    sum += nums;
                }
            }
            if(pieces>m){
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return end;
    }


}
