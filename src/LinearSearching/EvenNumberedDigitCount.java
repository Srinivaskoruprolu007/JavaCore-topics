package LinearSearching;

public class EvenNumberedDigitCount {
    public static void main(String[] args) {
        int[] arr = {23,3453,452,1,4567};
        evenDigit(arr);
    }
    static void evenDigit(int[] arr){
        int count = 0;
        for (int num:arr) {
            if(even2(num)){
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
    static boolean even2(int num){
        if(num<0){
            num *=-1;
        }
        return (int)(Math.log10(num)+1)%2==0;
    }
}
