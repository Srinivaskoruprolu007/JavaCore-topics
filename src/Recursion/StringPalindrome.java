package Recursion;

public class StringPalindrome {
    static boolean checkPalindrome(int left ,String s){
        int size = s.length();
        if(left>(left-size-1)){
            return true;
        } else if (s.indexOf(left)!=s.indexOf((left-size-1))) {
            return false;

        }
        return checkPalindrome(left+1,s);

    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(0,"MadaM"));
    }
}
