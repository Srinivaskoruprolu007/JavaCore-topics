package Searching;

import java.util.Arrays;

public class SearchingInStrings {
    public static void main(String[] args) {
        String str = "Srinivas";
        char target = 's';
        boolean result = search(str,target);
        System.out.println(result);
        System.out.println(Arrays.toString(str.toCharArray()));
    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
         for (char ch :str.toCharArray()) {
             if(target==ch){
                 return true;
             }

        }
         return false;
    }
}
