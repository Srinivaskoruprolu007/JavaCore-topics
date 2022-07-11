package ConditionsAndLoops;

import java.util.Scanner;

public class FibnocciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a =0;
        int i =1;
        int count = 2;
        while (count<=n){
            int temp = i;
            i = i+a;
            a = temp;
            count++;
        }
        System.out.println(i);

    }
}
