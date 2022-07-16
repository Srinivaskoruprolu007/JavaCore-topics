package Assignments.Questions.Answers;

import java.util.Scanner;

public class TakeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number :");
        int n = sc.nextInt();
        System.out.println("Enter your second number :");
        int m = sc.nextInt();
        System.out.println(sum(n,m));
    }
    static int sum(int n ,int m){
        return n+m;
    }
}
