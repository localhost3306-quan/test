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

public class BieuThucTangGiam {

    public static int n;
    public static int[] a;
    public static String s;

    public static boolean kt() {
        for (int l = 0; l < n - 1; l++) {
            if (s.charAt(l) == 'D' && a[l] < a[l + 1]) {
                return false;
            }
            if (s.charAt(l) == 'I' && a[l] > a[l + 1]) {
                return false;
            }
        }
        return true;
    }

    public static long chuyendoi() {
        long x = 0;
        for (int l = 0; l < n; l++) {
            x = (long) x * 10 + a[l];
        }
        return x;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            s = sc.next();
            n = s.length() + 1;
            a = new int[10];
            int i;
            for (i = 0; i < n; i++) {
                a[i] = i + 1;
            }
            long kq;
            if (kt()) {
                kq = chuyendoi();
            } else {
                kq = 999999999;
            }
            for (i = n - 1; i > 0; i--) {
                if (a[i] > a[i - 1]) {
                    int j;
                    for (j = n - 1; j >= i; j--) {
                        if (a[j] > a[i - 1]) {
                            int tg = a[j];
                            a[j] = a[i - 1];
                            a[i - 1] = tg;
                            break;
                        }
                    }
                    for (j = n - 1; j > ((n - 1 + i) / 2); j--) {
                        int tg = a[i + n - 1 - j];
                        a[i + n - 1 - j] = a[j];
                        a[j] = tg;
                    }
                    if (kt()) {
                        if (kq > chuyendoi()) {
                            kq = chuyendoi();
                        }
                    }
                    i = n;
                }
            }
            System.out.println(kq);
        }
    }
}
