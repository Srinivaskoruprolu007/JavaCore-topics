package Ptterns;

public class Pattern01 {
    public static void main(String[] args) {
        pattern01(5);
    }
    static void pattern01(int rows){
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


}
//result
/*
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
*/