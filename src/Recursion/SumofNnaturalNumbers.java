package Recursion;

public class SumofNnaturalNumbers {
    static int summing(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+summing(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(summing(20));
        parameteredSum(20,0);
    }
    static void parameteredSum(int n ,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        else {
            parameteredSum(n-1,sum+n);
        }
    }
}
