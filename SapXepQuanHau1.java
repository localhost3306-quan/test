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

public class SapXepQuanHau1 {

    public static int n, dem = 0, d;
    public static int[] a;
    public static int[][] b;
    public static boolean[] hang, cot, Xuoi, Nguoc;

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public static boolean kiemtra() {
        for (int i = 1; i <= n; i++) {
            hang[i] = true;

        }
        for (int i = 1; i <= 2 * n; i++) {

            Xuoi[i] = true;
            Nguoc[i] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (hang[a[i]] == true && Xuoi[i - a[i] + n] == true && Nguoc[i + a[i] - 1] == true) {
                hang[a[i]] = false;
                Xuoi[i - a[i] + n] = false;
                Nguoc[i + a[i] - 1] = false;
            } else {
                return false;
            }
        }
        return true;
    }

    public static int ketqua() {
        int k = 0;
        for (int i = 1; i <= n; i++) {
            k += b[i][a[i]];
        }
        return k;
    }

    public static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (cot[j]) {
                a[i] = j;
                cot[j] = false;
                if (i == n) {

                    if (kiemtra() == true) {

                        dem = max(dem, ketqua());

                    }
                } else {
                    Try(i + 1);
                }
                cot[j] = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int tc = sr.nextInt();
        while (tc > 0) {
            tc--;
            n = 8;
            hang = new boolean[n + 1];
            cot = new boolean[n + 1];
            b = new int[n + 1][n + 1];
            Nguoc = new boolean[2 * n + 1];
            Xuoi = new boolean[2 * n + 1];
            a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                hang[i] = true;
                cot[i] = true;

            }
            for (int i = 1; i <= 2 * n; i++) {

                Xuoi[i] = true;
                Nguoc[i] = true;
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    b[i][j] = sr.nextInt();
                }
            }
            dem = 0;

            Try(1);

            System.out.println(dem);

        }

    }
}
