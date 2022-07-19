package StringBuilders;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');// here the character converts into its unicode value i.e a=97,98
        System.out.println("a"+"b");// it prints ab
        // but u can't subtract Strings
//        u can also add integers to characters
        System.out.println('a'+3);// result = 100
        System.out.println('a'==97);// true
//        and we can also convert a char into integer
        System.out.println((int)'d');//result = 100
//        we know that every data type is actually a string format when we want to print
        System.out.println("a"+1);//result = a1
        /* let's do complex combinations */
        System.out.println("Kunal "+new ArrayList<>());// results = kunal []
        System.out.println("Srinivas"+new Integer(56));//results = Srinivas56
        //you can't concat two objects if u want concat you objects you have to add the least one  string
        System.out.println(new Integer(45)+""+ new ArrayList<>());//result = 45[]

    }
}
