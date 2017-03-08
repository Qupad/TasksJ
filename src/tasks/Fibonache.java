package tasks;

/**
 * Created by Maniak on 06.03.2017.
 */
import java.util.Scanner;

class Fibonache {
    public static void main(String[] args) {
        System.out.println("1 - Вывестие определённое количество чисел Фибоначи.");
        System.out.println("2 - Вывестие определённое число Фибоначи.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.print("Введите какое количество чисел Фибоначи вывести: ");
            int ch1 = sc.nextInt();
            chisla(ch1); }
        else if (n == 2)
            System.out.print("Введите какое номер числа Фибоначи вывести: ");
            int ch2 = sc.nextInt();
            chislo(ch2);
    }

    static int chisla(int x) {
        System.out.println();
        int a = 0;
        int b = 1;
        System.out.println();
        for(int i = 0;i<x;i++)
        {
            if (b > a) {
            System.out.print(a+" ");
            a = a + b; }
            else {
            System.out.print(b+" ");
            b = b + a; }
        }
        return 0;
    }
    static int chislo(int y) {
        int a = 0;
        int b = 1;
        int i = 0;
        int[] arr = new int[y];
        System.out.println();
        for(;i<y;i++)
        {
            if (b > a) {
                arr[i]= a;
                a = a + b; }
            else {
                arr[i]= b;
                b = b + a; }
        }
        System.out.println(arr[y-1]);
        return 0;
    }
}