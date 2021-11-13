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

public class DiChuyenTrongMeCung {

    static int[][] a = new int[20][20];
    static int[] result = new int[31];
    static int n, temp;
    static int checkCase;

    static void output() {
        for (int i = 1; i <= 30; i++) {
            if (result[i] == 1) {
                System.out.print("D");
            }
            if (result[i] == 2) {
                System.out.print("R");
            }
        }
        System.out.print(" ");
    }

    static void backTracking(int x, int y) {
        if (a[x + 1][y] == 1) {
            result[temp] = 1;
            temp++;
            backTracking(x + 1, y);
            result[--temp] = 0;
        }
        if (a[x][y + 1] == 1) {
            result[temp] = 2;
            temp++;
            backTracking(x, y + 1);
            result[--temp] = 0;
        }
        if (x == n && y == n) {
            output();
            checkCase++;
        }

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while (t-- > 0) {
            temp = 1;
            checkCase = 0;
            n = cin.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    a[i][j] = cin.nextInt();
                }
            }
            if (a[1][1] == 0 || a[n][n] == 0); else {
                backTracking(1, 1);
            }
            if (checkCase == 0) {
                System.out.print("-1");
            }
            System.out.println("");
        }
    }
}
