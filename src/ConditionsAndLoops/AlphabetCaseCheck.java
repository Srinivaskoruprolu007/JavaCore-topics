package ConditionsAndLoops;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your word : ");
        char ch = in.next().charAt(0);
        if(ch>='a'&& ch<='z'){
            System.out.println("it is a lower case word");
        }
        else {
            System.out.println("it is a upper case word");
        }
    }
}
