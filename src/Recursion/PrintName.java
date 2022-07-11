package Recursion;

public class PrintName {
    static void printingName(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("vasu");
        printingName(i+1,n);
    }

    public static void main(String[] args) {
        printingName(1,5);
    }
}
