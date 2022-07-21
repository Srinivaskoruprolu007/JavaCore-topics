package Ptterns;

public class Pattern02 {
    public static void main(String[] args) {
        pattern02(5);
    }

    static void pattern02(int rows){
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("*"+" ");
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
 */