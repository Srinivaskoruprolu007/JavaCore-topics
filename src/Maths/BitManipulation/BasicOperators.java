package Maths.BitManipulation;

public class BasicOperators {
    public static void main(String[] args) {
//        AND Operation
        /* 1 & 1 = 1
        *  1 & 0 = 0
        *  0 & 0 = 0
        *  0 & 1 = 0  */
        int n = 0;
        int m = 1;
        System.out.println(n & m);// results 0
//        OR Operation
        /* 1 | 1 = 1
        *  1 | 0 = 1
        *  0 | 0 = 0
        *  0 | 1 = 1*/
        System.out.println(n | m);// results 1
//        XOR Operation
        /* 1 ^ 0 = 1
        *  1 ^ 1 = 0
        *  0 ^ 1 = 1
        *  0 ^ 0 = 0*/
        System.out.println(n^m);// results 1
//        NOT Operation
        /* ~0 = 1
        *  ~1 = -1*/
        System.out.println(~n);//2's compliment of n
    }
}
