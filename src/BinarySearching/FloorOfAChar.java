package BinarySearching;

public class FloorOfAChar {
    public static void main(String[] args) {
        char[] letter = {'e','r','s','t'};
        char target = 't';
        System.out.println(floor(letter,target));
    }
    static char floor(char[] arr,char target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return arr[start % arr.length];// this is the only change from ceiling of number to small character
    }
}
