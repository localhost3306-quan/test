/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class XauConChungDaiNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            int[][] f = new int[1000][1000];
            for (int i = 1; i <= s1.length(); i++) {
                f[0][i] = 0;
            }
            for (int i = 1; i <= s2.length(); i++) {
                f[i][0] = 0;
            }
            f[0][0] = 0;
            for (int i = 1; i <= s2.length(); i++) {
                for (int j = 1; j <= s1.length(); j++) {
                    if (s2.charAt(i - 1) == s1.charAt(j - 1)) {
                        f[i][j] = f[i - 1][j - 1] + 1;
                    } else if (f[i - 1][j] > f[i][j - 1]) {
                        f[i][j] = f[i - 1][j];
                    } else {
                        f[i][j] = f[i][j - 1];
                    }
                }
            }
            System.out.println(f[s2.length()][s1.length()]);
        }

    }
}
