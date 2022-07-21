package Ptterns;

public class Pattern04 {
    public static void main(String[] args) {
        pattern04(5);
    }
    
    
    static void pattern04(int rows){
        for (int i = 0; i <rows; i++) {
            for (int j =rows; j>i; j--) {
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}
//result
/*
1 1 1 1 1
2 2 2 2
3 3 3
4 4
5
*/