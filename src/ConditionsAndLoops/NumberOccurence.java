package ConditionsAndLoops;

import java.util.Scanner;

public class NumberOccurence {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = in.nextInt();
        System.out.print("Enter your occurrence number : ");
        int o = in.nextInt();
        int count = 0;
        while (n>0){
            int r = n%10;
            if(r==o){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
