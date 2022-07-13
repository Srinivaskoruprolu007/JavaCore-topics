package LinearSearching;

public class MaximumIn2D {
    public static void main(String[] args) {
        int[][] numbers = {
                {2,3,4},
                {5,6,7,8},
                {9,10,11}
        };
        System.out.println(max(numbers));

    }
    static int max(int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
