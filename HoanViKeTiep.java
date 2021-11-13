
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class HoanViKeTiep {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int k;
        k = sr.nextInt();
        int dem = 1;
        while (k > 0) {
            k--;
            int n = sr.nextInt();
            int[] a = new int[10000];
            for (int i = 0; i < n; i++) {
                a[i] = sr.nextInt();
            }
            int vt = n;
            while (vt > 0 && a[vt - 1] > a[vt]) {
                vt--;
            }
            if (vt > 0) {
                int min = 1000, vt1 = 0;
                for (int i = vt; i < n; i++) {
                    if ((a[i] > a[vt - 1]) && ((a[i] - a[vt - 1]) < min)) {
                        min = a[i] - a[vt - 1];
                        vt1 = i;
                    }
                }
                int tg;
                tg = a[vt - 1];
                a[vt - 1] = a[vt1];
                a[vt1] = tg;
                for (int i = vt; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (a[i] >= a[j]) {
                            tg = a[i];
                            a[i] = a[j];
                            a[j] = tg;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            } else {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
