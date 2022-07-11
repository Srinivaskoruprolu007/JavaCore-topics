package Recursion;

public class FactorialOfN {
     static int getFactorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*getFactorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }
}
