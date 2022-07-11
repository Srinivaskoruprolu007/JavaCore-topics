package Recursion;

public class PrintingInreverse {
    static void printreversenum(int i,int n){
        if(n<i){
            return;
        }
        System.out.println(n);
        printreversenum(i,n-1);//Backtracking
    }

    public static void main(String[] args) {
        printreversenum(1,20);
    }
    static void reverseOrder(int n,int i){
        if(i<1){
            return;
        }
        reverseOrder(i-1,n);
        System.out.println(n);
    }

}
