package ConditionsAndLoops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        Q : print numbers from 1 to 5 using for loop
        for (short i = 1; i <=5; i++) {
            System.out.println(i);
        }

//       using while loop
        int num = 1;
        while (num<=5){
            System.out.print(num);
            num++;
        }

//      print num from 1 to n
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.print(i+" ");
        }
//        Do while loop
        int number = 1;
        do {
            System.out.println(number);//do while run the statement at least once then  it checks the condition
        }
        while (n>=5);
    }
}
