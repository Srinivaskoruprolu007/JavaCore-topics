package BinarySearching;

import java.util.Arrays;

public class LastAndFirstIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,5};
        int target = 2;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
    static int[] searchRange(int[]num,int target){
        int[] ans = {-1,-1};
        ans[0] = search(num,target,true);
        if(ans[0]!=-1){
            ans[1] = search(num,target,false);
        }
        return ans;
    }

    static int search(int[]num, int target,boolean firstIndex){
        int ans = -1;
        int start = 0;
        int end = num.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(target>num[mid]){
                start = mid+1;
            } else if (target<num[mid]) {
                end = mid -1;
            }
            else{
                ans = mid;
                if(firstIndex){
                    end = mid-1;
                }
                else start = mid + 1;
            }
        }
        return ans;
    }
}