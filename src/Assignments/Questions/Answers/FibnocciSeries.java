package Assignments.Questions.Answers;

public class FibnocciSeries {
    public static void main(String[] args) {
        int n =5;
        for (int i = 0; i <n ; i++) {
            System.out.println(fib(i));
        }

    }

    static int fib(int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        int num1 = 1;
        int num2 = 1;
        int num3;
        for (int i = 2; i <n; i++) {
            num3 = num1+num2;
            num1 = num2;
            num2 = num3;
        }
        return num2;
    }
}
