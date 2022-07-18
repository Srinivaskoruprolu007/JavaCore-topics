package Assignments.Questions.Answers;

import java.util.Scanner;

public class RupeesToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rupees :");
        int rupees = (int)sc.nextDouble();// this is called narrow casting
        System.out.println(rupeeToDollar(rupees));
    }

    static double rupeeToDollar(int rupees){
        return rupees*0.013;
    }
}
