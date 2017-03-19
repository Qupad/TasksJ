package tasks;

import java.util.Scanner;

/**
 * Created by Maniak on 19.03.2017.
 */
public class Cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(doCipher(s));
    }

    private static String doCipher(String s1) {
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
