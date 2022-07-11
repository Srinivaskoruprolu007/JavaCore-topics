package Recursion;

public class PowerofN {
    static int getPower(int a, int b){
        if(b==0){
            return 1;
        }
        else{
            return a*getPower(a,b-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(getPower(2,3));
    }
}
