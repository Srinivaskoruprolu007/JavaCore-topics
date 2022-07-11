package Recursion;

public class ReverseAnArray {
    static void getReverseAnArray(int left,int right,int[] arr){
        int temp;
        if(left>right){
            return;
        }
        else {
            temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            getReverseAnArray(left+1,right-1,arr);
        }
    }
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,6,72,9,0,5};
        reverseTheArray(0,arr);
        printArray(arr);
    }
    //using single variable
    static void reverseTheArray(int left,int[] arr){
        int size = arr.length;
        if(left>(size-left-1)){
            return;
        }
        else {
            int temp = arr[(size-left-1)];
            arr[(size-left-1)] = arr[left];
            arr[left] = temp;
            reverseTheArray(left+1,arr);
        }
    }
}
