package CycleSort;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {5,4,2,1,0};
        System.out.println(find(arr));
    }
    static int find(int[]arr){
        int i =0;
        while(i< arr.length){
            if(arr[i] < arr.length && arr[i] != arr[arr[i]]){
                swap(arr, i, arr[i]);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length ; j++) {
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
