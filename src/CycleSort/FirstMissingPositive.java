package CycleSort;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {-1,4,2,1};
        System.out.println(missingPositive(arr));
    }

    static int missingPositive(int[]arr){
        int i =0;
        while (i< arr.length){
            if(arr[i] > 0 && arr[i]<=arr.length && arr[i] != arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j <arr.length ; j++) {
            if(arr[j] != j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }

        private static void swap(int[] arr, int i, int i1) {
            int temp = arr[i];
            arr[i] = arr[i1];
            arr[i1] = temp;
    }


}
