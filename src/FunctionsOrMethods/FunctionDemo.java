package FunctionsOrMethods;

import java.util.Arrays;

public class FunctionDemo{
    public static void main(String... args) {
        function1();
        multipleArgs(1,5,"Srinivas","Panja");
    }

    static void function1(int... v){
        System.out.println(Arrays.toString(v));
    }
    static void multipleArgs(int a, int b, String... v){
//        parameters should be in order
    }
}