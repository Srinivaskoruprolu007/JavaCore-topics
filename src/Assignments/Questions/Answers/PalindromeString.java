package Assignments.Questions.Answers;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str));

    }
//to check palindrome, you first reverse the string then check both reversed string and normal string are equal or not
    static boolean isPalindrome(String s){
        String rev = null;
        for (int i =s.length()-1; i>=0; i--) {
            rev+=s.charAt(i);
        }
        return s.equals(rev);//this equals method comparing the values of strings
    }
}
