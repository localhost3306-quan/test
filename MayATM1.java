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

public class MayATM1 {

    static int n, s;
    static boolean end = true;
    static int[] a = new int[50];
    static int[] b = new int[50];

    static void generate(int k) {
        int i = k;
        while (i > 0 && b[i] == n - k + i) {
            i--;
        }
        if (i > 0) {
            b[i] += 1;
            for (int j = i + 1; j <= k; j++) {
                b[j] = b[j - 1] + 1;
            }
        } else {
            end = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            s = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            int kq = -1;
            for (int i = 1; i <= n; i++) {
                end = true;
                for (int j = 1; j <= i; j++) {
                    b[j] = j;
                }

                while (end && kq == -1) {
                    int res = 0;
                    for (int j = 1; j <= i; j++) {
                        res += a[b[j]];
                    }
                    if (res == s) {

                        kq = i;
                        end = false;
                    }
                    generate(i);
                }
            }
            System.out.println(kq);
        }
    }
}
