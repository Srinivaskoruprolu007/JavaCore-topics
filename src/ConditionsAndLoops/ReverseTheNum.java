package ConditionsAndLoops;

import java.util.Scanner;

public class ReverseTheNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you number :");
        int n = in.nextInt();
        int reve = 0;
        while (n>0){
            int rem = n%10;
            reve = (reve*10)+ rem;
            n=n/10;
        }
        System.out.println(reve);

    }
}
