package Searching;

public class WhoIsWealthier {
    public static void main(String[] args) {
        int[][] arr = {
            {1,4,5,6},
            {4,5,3,2},
            {8,3,1}
        };
        System.out.println(maximumWeatlth(arr));
    }
    static int maximumWeatlth(int[][] arr){
        int wealth = Integer.MIN_VALUE;
        for (int[] person:arr) {
            int sum = 0;
            for (int account:person) {
                sum+=account;
            }
            if(sum>wealth){
                wealth=sum;
            }
        }
        return wealth;
    }
}
