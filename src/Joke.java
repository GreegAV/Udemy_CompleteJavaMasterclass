/**
 * Created by avg-m on 02/09/2017.
 */
public class Joke {
    public static void main(String[] args) {
        int a=5,i;
        i= ++a + ++a + a++; //i=20, a=7
        System.out.println(a+" "+i);
        i= a++ + ++a + ++a; // i=27(28?),a=10
        System.out.println(a+" "+i);
        a= ++a + ++a + a++; //a=24(23?)
        System.out.println(i);
        System.out.println(a);
    }
}
