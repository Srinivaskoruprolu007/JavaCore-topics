package Ptterns;

public class Pattern05 {
    public static void main(String[] args) {
        pattern05(5);
    }


    static void pattern05(int row){
        for (int i = 1; i <row; i++) {
            for (int j =i; j <row; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
//result
/*
1 2 3 4
2 3 4
3 4
4
*/