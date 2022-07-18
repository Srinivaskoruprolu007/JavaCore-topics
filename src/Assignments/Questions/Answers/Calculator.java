package Assignments.Questions.Answers;

import java.util.Scanner;

public class Calculator {
//    now we're using enhanced switch statements to calculate the values between two numbers with different operators
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number :");
    int n = sc.nextInt();
    System.out.println("Enter the operator :");
    char operator = sc.next().charAt(0);
    System.out.println("Enter the second number :");
    int m = sc.nextInt();
    switch (operator){
        case '+' -> System.out.println(n+m);
        case '-' -> System.out.println(n-m);
        case '*' -> System.out.println(n*m);
        case '/' -> System.out.println(n/m);

        default -> throw new IllegalStateException("Unexpected value: " + operator);
    }
}
}
