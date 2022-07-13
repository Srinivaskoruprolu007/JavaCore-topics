package Searching;

public class EvenNumberedDigitCount {
    public static void main(String[] args) {
        int[] arr = {23,3453,452,1,4567};
        evenDigit(arr);
    }
    static void evenDigit(int[] arr){
        int count = 0;
        for (int num:arr) {
            if(even(num)){
                count++;
            }
        }
        System.out.println(count);
    }
    static boolean even(int num){
        int counter = 0;
        while (num!=0){
            num/=10;
            counter++;
        }
        return counter % 2 == 0;
    }
}
