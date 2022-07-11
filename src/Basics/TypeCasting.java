package Basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        implicit type conversion means automatic type conversion of lower to higher data type
        float f = 3;//here are we declare float but giving int value to it
//        explicit type conversion means  nothing automatic, but we have to convert the higher to lower data type range
        float t = (int) 5.6f;//Narrow type conversion
        System.out.println(t);
        int r = (byte)257;
        short s = (byte)256;
        byte b = 40;
        byte c = 50;

        int l= b*c/b;
        System.out.println(l);
        System.out.println(s);//256%256=0
        System.out.println(r);//257%128=1
        int num1 = 5;
        int num2 = 3;
        int num3 = num1/num2;
        System.out.println(num3);//it'll print the round off value
        double res = (float)num1/num2;//it'll print the entire result value after conversion

        System.out.println(res);
    }
}
