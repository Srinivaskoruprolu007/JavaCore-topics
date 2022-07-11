package Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] array = {1, 58, 6, 2, 9, 3};
        PrintTheArray(array);
    }
        static void PrintTheArray (int[] arr){
            for (int j : arr) {
                System.out.print(j + " ");
            }
        }
    }
