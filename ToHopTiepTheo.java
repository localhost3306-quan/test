
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
public class ToHopTiepTheo {

    public static int n;
    public static int[] a;
    public static boolean[] chuaxet;

    public static void quay_lui(int i) {

        for (int j = n; j >= 1; j--) {
            if (chuaxet[j]) {
                a[i] = j;
                chuaxet[j] = false;
                if (i == 1) {
                    for (int l = n; l >= 1; l--) {
                        System.out.print(a[l]);
                    }
                    System.out.print(" ");
                } else {
                    quay_lui(i - 1);
                }
                chuaxet[j] = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int k = sr.nextInt();
        while (k > 0) {
            k--;
            n = sr.nextInt();
            a = new int[n + 1];
            chuaxet = new boolean[n + 1];
            for (int i = 1; i <= n; i++) {
                chuaxet[i] = true;
            }
            quay_lui(n);
            System.out.println();
        }
    }
}
