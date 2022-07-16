package Assignments.Questions.Answers;


import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = sc.nextInt();
        System.out.println("Enter your range: ");
        int range = sc.nextInt();
        multiplication(n,range);
    }
    static void multiplication(int n,int range){
        for (int i =1;i<=range;i++){
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }
}
