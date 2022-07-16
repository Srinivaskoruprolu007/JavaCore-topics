package Assignments.Questions.Answers;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year to check : ");
        int year = sc.nextInt();
        System.out.println(isLeap(year));
    }
//this method checks whether the given year is leap or not
    static boolean isLeap(int year){
        return year % 4 == 0;
    }
}
