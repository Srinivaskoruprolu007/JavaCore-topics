package ConditionsAndLoops;

import java.util.Scanner;

public class TrimTheWhiteSpaces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your word ");
        String s = in.next();
        s.trim();
        System.out.println(s);
    }
}
