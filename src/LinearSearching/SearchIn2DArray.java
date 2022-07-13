package LinearSearching;

import java.util.Arrays;

public class SearchIn2DArray {
    static void search(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("The target found at "+(i+1)+" row and "+(j+1)+" colum");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] numbers = {
            {2,3,4},
            {5,6,7,8},
            {9,10,11}
        };
        int target =11;
        search(numbers,target);
        System.out.println(Arrays.toString(searchele(numbers, target)));
    }
//   let's do this by array as return type
static int[] searchele(int[][]arr,int target) {
    int i;
    int j;
    for (i = 0; i < arr.length; i++) {
        for (j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == target) {
                return new int[]{i,j};
            }
        }
    }
    return new int[]{-1,-1};

}
}
