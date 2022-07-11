package Arrays;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[][] Names = {{"Sri","Yellow",},{"prepos"}};
        int[][] number = new int[4][3];
        //that's not mandatory to declare columns
        int[][] num= {
                {1, 8, 9},
                {4, 8},
                {5, 8, 6, 4}
        };
        for (int[] ints : num) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        for (int[] a:num) {
            System.out.println(Arrays.toString(a));
        }
    }
   
    
}
