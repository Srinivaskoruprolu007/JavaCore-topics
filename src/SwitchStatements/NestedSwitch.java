package SwitchStatements;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employ ID");
        int employID = sc.nextInt();
        System.out.println("Enter the department");
        String department = sc.nextLine();
        switch (employID){
            case 1-> System.out.println("koruprolu");
            case 2-> System.out.println("Srinivas");
            case 3-> {
                System.out.println("Employ number 3");
                switch(department){
                    case "IT"-> System.out.println("Information technology");
                    case "HR"-> System.out.println("Human resources ");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct employ id ");

        }
    }
}
