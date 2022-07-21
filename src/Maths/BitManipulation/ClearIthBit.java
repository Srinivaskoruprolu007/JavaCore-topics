package Maths.BitManipulation;

public class ClearIthBit {
    public static void main(String[] args) {
        int n = 5;
        int ith =1;
        System.out.println(clearIthBit(n,ith));
    }

    static int clearIthBit(int n, int ith){
        return (n & (~(1<<ith-1)));//make the ith bit to 0
    }
}
