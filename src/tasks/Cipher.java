package tasks;

import java.util.Scanner;

/**
 * Created by Maniak on 19.03.2017.
 */
public class Cipher {
    public static void main(String[] args) {
        Check check = new Check();
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\tChoose:\n1 - Cipher;\n2 - Decipher.");
        int chosen = sc.nextInt();
        if (chosen == 1) {
            System.out.println("Write ur text to cipher.");
            System.out.println(check.doCipher());
        }
        if (chosen == 2) {
            System.out.println("Write ur text to decipher.");
            System.out.println(check.doDecipher());
        }
    }
}
class Check {
    static String doDecipher() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char[] decipher = new char[s1.length()];
        decipher = s1.toCharArray();
        System.out.println("Write ur key.");
        int key = sc.nextInt();
        if (key > 0) {
        for (int i=0;i < s1.length();i++) {
            if (decipher[i] == 32)
                continue;
            decipher[i] = (char) (decipher[i] - key); }
        }
        return String.valueOf(decipher);
    }

    static String doCipher() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char[] cipher = new char[s1.length()];
        cipher = s1.toCharArray();
        for (int i=0;i < s1.length();i++) {
            if (cipher[i] == 32)
                continue;
           cipher[i] = (char) (cipher[i] + 1);
        }
        return String.valueOf(cipher);
    }
}

