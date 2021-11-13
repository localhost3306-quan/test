/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class DoiChoCacChuSo {

    public static int index, max;
    public static char[] s;

    public static void Try(int k) {
        if (k == 0) {
            return;
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i] < s[j]) {
                    char tg;
                    tg = s[i];
                    s[i] = s[j];
                    s[j] = tg;
                    if (max < Integer.parseInt(String.valueOf(s))) {
                        max = Integer.parseInt(String.valueOf(s));
                    }
                    Try(k - 1);
                    tg = s[i];
                    s[i] = s[j];
                    s[j] = tg;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int tc = sr.nextInt();
        while (tc > 0) {
            tc--;
            int k = sr.nextInt();
            String chuoi = sr.next();
            s = chuoi.toCharArray();
            max = Integer.parseInt(String.valueOf(s));
            Try(k);
            System.out.println(max);
        }
    }
}
