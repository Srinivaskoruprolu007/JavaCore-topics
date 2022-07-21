package Maths.BitManipulation;

public class EvenOrOdd {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isEven(n) ? n+" is Even" : n+" is odd" );
    }

    static boolean isEven(int n){
        return (n & 1) == 0;
    }
}
