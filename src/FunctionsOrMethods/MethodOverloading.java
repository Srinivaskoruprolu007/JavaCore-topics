package FunctionsOrMethods;

public class MethodOverloading {
//    method overloading
    /*Methods have same named but having different parameters for example
    * fun(int n)
    * fun(String name) */

    static void fun(String name){
        System.out.println(name+" having fun");
    }
    static void fun(int number){
        System.out.println(number+" is my lucky number");
    }

    public static void main(String[] args) {
        fun(7);
        fun("srinivas");
    }

}
