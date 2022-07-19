package StringBuilders;
import java.util.Scanner;

public class PalindromeCheckUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String :");
        String s = sc.nextLine();
        System.out.printf(isPalindrome(s) ? "%s is palindrome ":"%s is not palindrome",s,s);
    }

    static boolean isPalindrome(String str){
        if(str==null || str.length()==0){
            return true;
        }
        str = str.toLowerCase();
        int half_size = str.length()/2;
        for (int i = 0; i < half_size; i++) {
            char start = str.charAt(i);
            char end = str.charAt(half_size-1-i);
            if (start != end) return false;
        }
        return true;
    }
}
