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

public class TapHop {

    public static int n, k, s;
    public static int[] a;
    public static int stop = 0;

    public static void sinh() {
        int i = k;
        while (i > 0 && a[i] == n - k + i) {
            i--;
        }
        if (i > 0) {
            a[i]++;
            for (int j = i + 1; j <= k; j++) {
                a[j] = a[j - 1] + 1;
            }
        } else {
            stop = 1;
        }
    }

    public static int tinh_tong() {
        int tong = 0;
        for (int i = 1; i <= k; i++) {
            tong = tong + a[i];
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        while (true) {
            n = sr.nextInt();
            k = sr.nextInt();
            s = sr.nextInt();
            stop = 0;
            a = new int[k + 1];
            if (n == 0 && k == 0 && s == 0) {
                break;
            }
            if (k > n) {
                System.out.println(0);
            } else {
                for (int i = 1; i <= k; i++) {
                    a[i] = i;
                }

                int dem = 0;
                while (stop != 1) {
                    int x = tinh_tong();
                    if (x == s) {
                        dem++;
                    }
                    sinh();

                }

                System.out.println(dem);
            }
        }

    }
}
