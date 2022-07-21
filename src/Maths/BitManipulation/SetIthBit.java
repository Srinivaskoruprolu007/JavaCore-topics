package Maths.BitManipulation;

public class SetIthBit {
    public static void main(String[] args) {
        int n =5;
        int ith = 2;
        System.out.println(setIthBit(n,ith));
    }

    static int setIthBit(int n, int ith){
        return (n | (1<<(ith-1)));//It means make the ith bit to 1
    }
}
