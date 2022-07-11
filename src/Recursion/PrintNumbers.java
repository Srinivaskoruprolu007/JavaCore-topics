package Recursion;

public class PrintNumbers {
    static void printingNumbers(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        printingNumbers(i+1,n);
    }

    public static void main(String[] args) {
        printingNumbers(1,20);
        backtrack(20,20);
    }
//    by using backtracking
    static void backtrack(int i, int n){
        if(i<1){
            return;
        }
        backtrack(i-1,n);//backtracking
        System.out.println(i);
    }

}
