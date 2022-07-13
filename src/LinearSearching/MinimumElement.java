package LinearSearching;

public class MinimumElement {
    static void minElement(int[] arr){
        if (arr == null) return;
        int min = arr[0];
        for (int i=1;i< arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] arr = {3,-4,6,7};
        minElement(arr);
    }
}
