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
public class SoFiboThuN {

    public static long[][] a = {{1, 1}, {1, 0}};

    public static long[][] nhan_ma_tran(long x[][], long x1[][]) {
        long[][] y = new long[2][2];
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                for (int k = 0; k <= 1; k++) {
                    y[i][j] = (y[i][j] + x[i][k] * x1[k][j]) % 1000000007;
                }
            }
        }

        return y;
    }

    public static long[][] tim_fibo(long x[][], int n) {
        if (n == 1) {
            return a;
        }
        if (n % 2 != 0) {
            return nhan_ma_tran(tim_fibo(x, n - 1), x);
        }
        long[][] xx = tim_fibo(a, n / 2);
        return nhan_ma_tran(xx, xx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n;
            n = sc.nextInt();
            long[][] ll = tim_fibo(a, n);
            System.out.println(ll[0][1]);
        }

    }
}
