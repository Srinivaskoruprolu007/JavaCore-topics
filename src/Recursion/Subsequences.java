package Recursion;


import java.util.ArrayList;

public class Subsequences{
    static void getSub(int index, ArrayList<Integer> Array,int[] arr, int size){
        if(index==size){
            for (int ele:Array) {
                System.out.print(ele+" ");
            }
            System.out.println();
            return;
        }
        Array.add(arr[index] );
        getSub(index+1,Array,arr,size);
        Array.remove(index);
        getSub(index+1,Array,arr,size);
    }

    public static void main(String[] args) {
        int[] num = {3,2,1};
        int si = num.length;
        ArrayList<Integer> arr = new ArrayList<>(5);
        getSub(0,arr,num,si);
    }
}
