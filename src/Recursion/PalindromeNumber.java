package Recursion;

public class PalindromeNumber {
    static void checkPalindromeNum(int num) {
        int sum = 0;
        int rem = 0;
        int temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num /= 10;
        }
        if (sum == temp) {
            System.out.println("this number  is a palindrome ");
        } else {
            System.out.println("this number " + num + " is not a palindrome");
        }
    }

    public static void main(String[] args) {
        checkPalindromeNum(232);
    }
}
