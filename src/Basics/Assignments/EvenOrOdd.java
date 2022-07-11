package Basics.Assignments;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Question = "Enter your number to check : ";
        System.out.print(Question);
        int n = in.nextInt();
        if((n&1)==0){
            System.out.println("The entered number is Even");
        }
        else {
            System.out.println("The entered number is odd");
        }

    }


}
