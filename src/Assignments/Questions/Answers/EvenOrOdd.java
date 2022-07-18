package Assignments.Questions.Answers;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check :");
        int n = sc.nextInt();
        System.out.println(isEven(n));
        System.out.println(isOdd(n));
    }
//first method
    static boolean isEven(int n){
        return (n&1)==0;
        //here we're doing AND operation between the number and one which gives either 0 or 1
//        if it is 1 then it is odd else even
    }
//    second method using modulo operator
    static boolean isOdd(int n){
        return n%2!=0;
    }
}
