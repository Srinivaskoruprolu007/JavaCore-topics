package Recursion;

public class HelloWorld {//print Hello world for many times as would we want
//    let's create a method(recursive Method)
    static void helloWorld(int n){
        if(n==0){// this is the base case where the method actually exists
            return;
        }
        System.out.println("Hello world");
        helloWorld(n-1);
    }

    public static void main(String[] args) {
        helloWorld(5);
    }
}
