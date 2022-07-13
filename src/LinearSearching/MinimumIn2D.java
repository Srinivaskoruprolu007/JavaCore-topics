package LinearSearching;

public class MinimumIn2D {
    public static void main(String[] args) {
        int[][] numbers = {
                {-1,3,4},
                {5,6,7,8},
                {9,10,11}
        };
        System.out.println(min(numbers));
    }
    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int[] num:arr) {
            for (int n:num) {
                if (n<min){
                    min = n;
                }
            }
        }
        return min;
    }
}
