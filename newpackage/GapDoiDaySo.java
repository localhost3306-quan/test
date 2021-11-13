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
public class GapDoiDaySo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n;
            long k;
            n = sc.nextInt();
            k = sc.nextLong();
            System.out.println(tim_vt(n, k));
        }

    }

    public static long tim_vt(int x, long y) {
        if (y == 1) {
            return 1;
        }
        if (y == (long) (Math.pow(2, x - 1))) {
            return x;
        }

        if (y < Math.pow(2, x - 1)) {
            return tim_vt(x - 1, y);
        } else {
            return tim_vt(x - 1, (long) (y - Math.pow(2, x - 1)));
        }
    }
}
