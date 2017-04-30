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
        for(;;){
            middle++;
            if(middle == second) {
                if(absent) {
                    System.out.println("Absent");
                    break;
                }
                System.out.println(second);
                break;
            }
            if(middle%2 != 0&&middle%3 != 0&&middle%4 != 0&&middle%5 != 0&&middle%6 != 0&&middle%7 != 0&&middle%8 != 0&&middle%9 != 0||middle == 2 || middle == 3|| middle == 5|| middle == 7){
                while (j == 0) {
                    System.out.println(first);
                    j++;
                }
                System.out.println(middle);
                absent = false;
            }
        }
    }
}
