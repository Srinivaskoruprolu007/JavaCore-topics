package Maths.BitManipulation;

public class BitWiseOperators {
    public static void main(String[] args) {
//        Left Shift Operator
        /*  It will do left shifting the bit of a number with n times*/
        System.out.println(1<<5);//it will do left shift the 1 by 5 zeroes
//        result = 0001 ->> 0100000 == 32
//        Right shift Operator
        /* It will do right shifting the bit of a number with n times */
        System.out.println(32>>5);//result = 010000 ->> 000001 = 1
    }
}
