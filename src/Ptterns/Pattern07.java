package Ptterns;

public class Pattern07 {
    public static void main(String[] args) {
        pattern07(5);
    }
    static void pattern07(int row){
        for (int i = 0; i <2*row ; i++) {
            int rowsInColumn = i > row ? (2*row)-i: i;
            for (int j = 0; j <rowsInColumn ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//result
/*
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * *
 *
 */