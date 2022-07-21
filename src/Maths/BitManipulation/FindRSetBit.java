package Maths.BitManipulation;

public class FindRSetBit {
    //find the right most set bit
    /*    001010 ==> ans = 2 */
    public static void main(String[] args) {
        int n = 5;
        System.out.println(rightSetBit(n));
    }

    static int rightSetBit(int n){
        return (n & (-n));
    }
}
