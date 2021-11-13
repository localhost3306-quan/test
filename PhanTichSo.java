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

public class PhanTichSo {

    public static int n, k, ok = 1, count;
    public static int[] X;

    public static void Next_div() {
        int i = k, j, R, S, D;

        while (i > 0 && X[i] == 1) {
            i--;
        }
        if (i > 0) {
            X[i] = X[i] - 1;
            D = k - i + 1;
            R = D / X[i];
            S = D % X[i];
            k = i;
            if (R > 0) {
                for (j = i + 1; j <= i + R; j++) {
                    X[j] = X[i];
                }
                k = k + R;
            }
            if (S > 0) {
                k = k + 1;
                X[k] = S;

            }
        } else {
            ok = 0;
        }
    }

    public static void result() {
        int i;
        count++;
        System.out.print("(");
        for (i = 1; i <= k; i++) {
            if (i == k) {
                System.out.print(X[i]);
            } else {
                System.out.print(X[i] + " ");
            }
        }
        System.out.print(") ");

    }

    public static void Division() {
        ok = 1;
        while (ok == 1) {
            result();
            Next_div();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sr = new Scanner(System.in);
        int tc = sr.nextInt();
        while (tc > 0) {
            tc--;
            n = sr.nextInt();
            X = new int[n + 1];
            k = 1;
            count = 1;
            X[k] = n;
            Division();
            System.out.println();
        }

    }
}
