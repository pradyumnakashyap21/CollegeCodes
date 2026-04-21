package labsheet15;

import java.util.Scanner;

public class meow {
    static void computeLPS(String pat, int[] lps) {
        int len = 0;
        lps[0] = 0;
        int i = 1;
        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0)
                    len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pat = sc.next();
        sc.close();

        int[] lps = new int[pat.length()];
        computeLPS(pat, lps);

        int i = 0, j = 0;
        boolean found = false;

        while (i < text.length()) {
            if (text.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }
            if (j == pat.length()) {
                System.out.println(i - j);
                j = lps[j - 1];
                found = true;
            } else if (i < text.length() && text.charAt(i) != pat.charAt(j)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }

        if (!found)
            System.out.println("Pattern Not Found");
    }
}

