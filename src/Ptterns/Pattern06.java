package Ptterns;

public class Pattern06 {
    public static void main(String[] args) {
        pattern06(5);
    }
    static void pattern06(int row){
        for (int i = 1; i <row; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
//result
/*
1
12
123
1234
*/