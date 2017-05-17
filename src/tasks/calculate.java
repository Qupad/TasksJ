package tasks;

import java.util.*;

/**
 * Created by Maniak on 17.05.2017.
 */
public class calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();
        calculated(a,b,c);
    }
    static void calculated(int first, char act, int second){
        if(act == '+')
            System.out.println(first+second);
        else if(act == '-')
            System.out.println(first-second);
        else
            System.out.println("Faka u.");
    }
}
