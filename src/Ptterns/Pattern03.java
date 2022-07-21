package Ptterns;

public class Pattern03 {
    public static void main(String[] args) {
        pattern03(5);
    }


    static void pattern03(int row){
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <row-i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
/* result
 * * * * *
 * * * *
 * * *
 * *
 *
 */