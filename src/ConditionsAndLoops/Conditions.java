package ConditionsAndLoops;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your salary : ");
        int salary = in.nextInt();
        if (salary > 10000) {
            int newSalary = salary + 2000;
            System.out.println(newSalary);
        } else {
            int newSalary = salary+1000;
            System.out.println(newSalary);
        }

    }
}