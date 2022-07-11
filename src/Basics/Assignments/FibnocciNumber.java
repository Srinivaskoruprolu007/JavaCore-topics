package Basics.Assignments;

import java.util.Scanner;

public class FibnocciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        int counter = 0;
        while (counter<n){
            num3 = num1+num2;
            num1 = num2;
             num2 = num3;

             counter++;
            
        }
        System.out.println("The fibnocci number upto"+n+" is "+num1);
    }
}
