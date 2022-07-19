package StringBuilders;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Srinivas ";
        System.out.println(name);//with white spaces
//        we knew that Strings are immutable but if any modifications done then it creates new object
        System.out.println(name.strip());//without white spaces... strip() method
        System.out.println(name.toUpperCase());//returns upper case of the String
        System.out.println(name.toLowerCase());//returns lower case of the string
        System.out.println(name.charAt(0));// return char value at index position 0
        System.out.println(name.indexOf('s'));//returns the index value of a char in a string
        System.out.println(name.indent(5));// it prints the string with n spaces before a string

    }
}
