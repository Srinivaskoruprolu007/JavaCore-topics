package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Primitive data type arrays
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 47;
        arr[3] = 48;
        arr[4] = 49;
        System.out.println(arr[4]);
//        how far we use sout for printing the elements in an array
//        by using for loop
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i]+" ");
            i++;
        }
//        by using enhanced  for loop
        for (int num:arr) {
            System.out.print(num+" ");
        }
//        or you can do by inbuilt method toString of Arrays class
        System.out.println(Arrays.toString(arr));

//        to input an array
        int[] Array = new int[5];
        for (int j = 0; j< Array.length; j++) {
            Array[j] = in.nextInt();
        }
//        Array of objects
        System.out.println("Enter your elements in String Array");
        String[] str = new String[4];
        for (int j = 0; j < str.length; j++) {
            str[j] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}

