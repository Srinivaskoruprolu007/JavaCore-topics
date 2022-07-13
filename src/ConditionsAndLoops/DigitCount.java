package ConditionsAndLoops;


public class DigitCount{
    public static void main(String[] args) {
        System.out.println(counter(0));
        System.out.println(digit(-54));
    }
    static int counter(int n){
        if (n==0) {
            return 1;
        }
        int count = 0;
        while(n!=0){
            count+=1;
            n/=10;
        }
        return count;
    }
    static int digit(int num){
        if (num<0){
            num = num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
}