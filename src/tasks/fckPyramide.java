package tasks;

/**
 * Created by Maniak on 05.03.2017.
 * DO A FCK PYRAMID.
 */
public class fckPyramide {
    public static void main(String[] args) throws Exception {
        int q = 0;
        int b = 1;
        for (int i = 0; i < 10; i++)
        {
            System.out.print(8);

            for (; q < 0; q++)
            {
                System.out.print(8);
            }
            System.out.println();
            q = q - b;
            b++;
        }
    }
}

