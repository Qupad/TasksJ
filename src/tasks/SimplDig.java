package tasks;

import java.util.*;

/**
 * Created by Maniak on 30.04.2017.
 */
public class SimplDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int middle = first;
        boolean absent = true;
        int j = 0;
        for (; ; ) {
            boolean print = true;
            middle++;
            for (int q = 2; q < middle; q++) {
                if (middle % q == 0) {
                    print = false;
                    break;
                }
            }
            if(middle == second) {
                if(absent) {
                    System.out.println("Absent");
                    break;
                }
                System.out.println(second);
                break;
            }
            if (print) {
                absent = false;
                while(j == 0) {
                    System.out.println(first);
                    j++;
                }
                System.out.println(middle);
            }
        }
    }
}
