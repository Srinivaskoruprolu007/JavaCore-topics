package ConditionsAndLoops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = in.nextInt();
        System.out.println("Enter the Second number : ");
        int num2 = in.nextInt();
        System.out.println("Enter the third number : ");
        int num3 = in.nextInt();
        if(num3> num1){
            System.out.println("The maximum number is "+num3);
        } else if (num2> num1) {
            System.out.println("The maximum number is "+num2);
        }
        else {
            System.out.println("The maximum number is "+ num1);
        }
        if(num1>num2&&num1>num3){
            System.out.println("the maximum number is "+num1);
        } else if (num3>num1) {
            System.out.println("The maximum number is "+num3);
        }
        else {
            System.out.println("The maximum number is "+num2);
        }
//        using math class in java
        int maximum = Math.max(2,4);
        System.out.println(maximum);

    }

}
