package ConditionsAndLoops;


public class DigitCount{
    public static void main(String[] args) {
        counter(67997);
    }
    static void counter(int n){
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem<=10){
                count+=1;
            }
            n/=10;
        }
        System.out.println(count);
    }
}