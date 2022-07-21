package StringBuilders;

public class StringClass {
    public static void main(String[] args) {
        String name = new String("sri");
        String b =new String( "sri");
        System.out.println(name.equals(b));// it will give true because we're comparing the values with .equals method
        System.out.println(name==b);// it will give false because we're comparing the objects....
        char [] str = {'s','r','i'};
        String character = new String(str);// converting the character array into string
        System.out.println(character);
//        let's extract the individual characters in a string
        System.out.println(character.charAt(0));//it prints the char at 0 index
//        everything that prints on our console is actually a string in internally
        String num = String.valueOf(4);// here we can observe that every data type should print in  string format
        System.out.println(String.valueOf(4));


    }
}
