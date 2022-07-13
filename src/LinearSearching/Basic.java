package LinearSearching;

public class Basic {
    public static void main(String[] args) {
        int[] arr = {4,5,3,5,32,5,7,8,9};
        int n = 9;
        System.out.println("The element "+n+" is found at "+linearSearch(arr,n));

    }
    static int linearSearch(int [] arr,int search) {
        if (arr.length == 0) return -1;
        int i;
        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] == search) {
                break;
            }
        }
        return i;
    }


}
