package tasks;

import java.util.*;

/**
 * Created by Maniak on 28.03.2017.
 */
public class Sht {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int finNumb = sc.nextInt();
        int sum = 0;
        int temp2 = 0;
        int j = 0;
        int plusC = 1;
        int minusC = 1;
        int repeat= 0;
        boolean plus = true;
        boolean minus = false;
        boolean first = true;
        boolean second = false;
        char[] print = new char[count];
        int[] Array = new int[count];
        char[] tempArray = new char[count];
        for (int i = 0; i < count; i++) {
            Array[i] = sc.nextInt();
            sum = sum + Array[i];
        }
        sc.close();
        int temp = Array[0];
        if (sum < finNumb)
            System.out.println("No solution");
        else {
            for (int i = 1;; i++) {
                j++;
                if (plus) {
                    temp = temp + Array[i];
                    print[i - 1] = '+';
                    plus = true;
                }
                if (minus) {
                    temp = temp - Array[i];
                    print[i - 1] = '-';
                    minus = true;
                }
                if (j == count - 1) {
                    temp2 = j;
                    first = false;
                    second = true;
                }
                if (temp2 + minusC == j && first) {
                    if(minusC == count-1) {
                        plusC++;
                        minusC = 1;
                    }
                    if(plusC == count-1 && minusC == count-1) {
                        break;
                    }
                    minus = true;
                    plus = false;
                    temp2 = j;
                    second = true;
                    first = false;
                }
                if (temp2 + plusC == j && second) {
                    minus = false;
                    plus = true;
                    temp2 = j;
                    first = true;
                    second = false;
                }
                if (temp == finNumb) {
                    for (int q = 0; q < count; q++) {
                        System.out.print(Array[q] + "" + print[q]);
                    }
                    System.out.println("= " + finNumb);
                    break;
                }
                    System.out.print(Arrays.toString(tempArray)+":"+Arrays.toString(print));

                    if (i == count - 1) {
                        repeat++;
                        i = 1;
                        temp = Array[0];
                        if(tempArray == print)
                            minusC++;
                        if(j == (count-1)*repeat)
                            tempArray = print;
                    }
                    if (j == count * (count * 3)) {
                        System.out.println("No solution");
                        break;
                    }
                }
            }
        }
    }

