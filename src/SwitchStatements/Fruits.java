package SwitchStatements;

import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruit name : ");
        String fruits = sc.nextLine();
        switch (fruits) {
            case "Grapes":
                System.out.println("The little one");
                break;
            case "Mango":
                System.out.println("King of fruits");
                break;
            default:
                System.out.println("Please enter the fruit name ");
                break;
        }
        System.out.println("Enter the number of the day :");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter a valid week day number");
        }
    }
}
