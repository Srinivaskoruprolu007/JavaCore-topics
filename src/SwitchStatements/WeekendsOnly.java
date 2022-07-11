package SwitchStatements;

import java.util.Scanner;

public class WeekendsOnly {
    public static void main(String[] args) {
        System.out.println("Enter the day number");
        Scanner in = new Scanner(System.in);
        int Day = in.nextInt();
        switch (Day) {
            case 1, 2, 3, 4, 5 -> System.out.println("WeekDays boring days");
            case 6 -> System.out.println("Yahoo its saturday weekend day");
            case 7 -> System.out.println("Yahoo it's sunday weekend day");
        }
    }
}
