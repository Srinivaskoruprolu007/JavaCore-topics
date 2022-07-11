package Basics.Assignments;

import java.util.Scanner;

public class SimpleInterest {
//    S.I = principle * time * rate of interest /100
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the principle Amount : ");
            float Pa = in.nextFloat();
            System.out.print("Enter the time period : ");
            double time = in.nextDouble();
            System.out.print("Enter the rate of interest : ");
            long rate_of_interest = in.nextLong();
            double si = (Pa * time * rate_of_interest)/100;
            System.out.println("The simple interest is "+si);
    }
}
