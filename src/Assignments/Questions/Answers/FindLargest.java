package Assignments.Questions.Answers;

import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number :");
        int num2 = sc.nextInt();
        System.out.println(findLargest(num1,num2));
        System.out.print(findMax(num2,num1));
    }
// using if conditions
    static int findLargest(int n, int m){
        if (n>m) return n;
        else return m;
    }
//    using standard math library
    static int findMax(int n, int m){
        return Math.max(n,m);
    }

}
