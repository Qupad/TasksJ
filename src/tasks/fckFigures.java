package tasks;
 /**
 * Created by Maniak on 05.03.2017.
 * DO some shit.  m - height, n - weight.
 */

import java.util.*;

public class fckFigures {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose height: ");
        int m = sc.nextInt();
        System.out.print("Choose weight: ");
        int n = sc.nextInt();

        for (int i = 0; i < m; i++)
        {
            for (int t = 0; t < n; t++)
            {
                System.out.print(8);
            }
            System.out.println("");
        }
    }
}
