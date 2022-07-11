package Basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the roll number = ");
        int roll_number = input.nextInt();
        System.out.println("Your roll_number is "+roll_number);
        System.out.println("Enter the name of the student ");
        String name = input.next();
        System.out.println("The student name is "+name);
    }
}
