package tasks;

/**
 * Created by Maniak on 06.03.2017.
 */
public class Fibonache {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        for (int i = 0;i < 20;i++) {
            System.out.print(a + " " + b + " ");
            a = a + b;
            b = b + a;
        }
    }
}
