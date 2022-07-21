package Maths.BitManipulation;

public class FindIthBit {
    public static void main(String[] args) {
        int n =5;
        int ith = 1;
        System.out.println(ithBit(n,ith));
    }

    static int ithBit(int n,int ith){
        return (n & (1 << (ith - 1)))>>(ith-1);
    }
}
