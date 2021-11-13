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

public class HoanViXauKiTu {

    public static int n;
    public static String s;
    public static int[] a;
    public static boolean[] chuaxet;

    public static void quay_lui(int i) {

        for (int j = 0; j < n; j++) {
            if (chuaxet[j]) {
                a[i] = j;
                chuaxet[j] = false;
                if (i == n - 1) {
                    for (int l = 0; l < n; l++) {
                        System.out.print(s.charAt(a[l]));
                    }
                    System.out.print(" ");
                } else {
                    quay_lui(i + 1);
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
            s = sr.next();
            n = s.length();
            chuaxet = new boolean[n];
            a = new int[n + 1];
            for (int i = 0; i < n; i++) {
                chuaxet[i] = true;
            }
            quay_lui(0);
            System.out.println();
        }

    }
}
