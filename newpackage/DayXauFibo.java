/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class DayXauFibo {

    static long[] a;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        a = new long[95];
        a[1] = 1;
        a[2] = 1;
        for (int i = 3; i <= 92; i++) {
            a[i] = a[i - 1] + a[i - 2];

        }
        while (tc-- > 0) {
            int n;
            long k;
            n = sc.nextInt();
            k = sc.nextLong();
            System.out.println(tim_vt(n, k));

        }

    }

    public static char tim_vt(int x, long y) {
        if (x == 1) {
            return 'A';
        }
        if (x == 2) {
            return 'B';
        }
        if (y > a[x - 2]) {
            return tim_vt(x - 1, y - a[x - 2]);
        } else {
            return tim_vt(x - 2, y);
        }
    }
}
