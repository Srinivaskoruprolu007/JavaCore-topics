package StringBuilders;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            char ch = (char) ('a'+i );
//            builder.append(ch+" ");
            builder.append(ch).append(" ");//this is chained append
        }
        System.out.println(builder);
        StringBuilder str = new StringBuilder("MADAM");
        System.out.println(str);

    }


}
