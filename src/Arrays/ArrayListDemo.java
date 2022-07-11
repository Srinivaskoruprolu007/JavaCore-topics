package Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(2);
        list.add(22);
        list.add(25);
        list.add(42);
        list.add(344);
        list.add(77);
        list.set(0,99);
        System.out.println(list.contains(4563));
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println(list);
    }
    //Syntax


}
