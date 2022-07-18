package Assignments.Questions.Answers;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle Amount :");
        int Principle = sc.nextInt();
        System.out.println("Enter the Time period :");
        int TimePeriod = sc.nextInt();
        System.out.println("enter the rate of interest :");
        int Rate_of_Interest = sc.nextInt();
        System.out.println(simpleInterest(Principle,TimePeriod,Rate_of_Interest));

    }
    static  int simpleInterest(int P,int R,int T){
        return (P * T * R)/100;
    }
}
