package tasks;

/**
 * Created by Maniak on 05.03.2017.
 */
public class lines {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.print(" "+8);
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(8);
                for (int c = 0; c < 19;c++) {
                System.out.print(" ");
                }
            System.out.println(8);
        }
        for (int a = 0; a < 10; a++)
            System.out.print(" "+8);
    }
}
