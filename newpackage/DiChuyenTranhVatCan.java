/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author pc
 */
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class DiChuyenTranhVatCan {

    public static int n;
    public static char[][] a;
    public static int x1, x2, x3, x4;
    public static boolean[][] kt;

    public static void tim_duong() {
        Queue<Integer> qu_x = new ArrayDeque<Integer>();
        Queue<Integer> qu_y = new ArrayDeque<Integer>();
        Queue<Integer> qu_val = new ArrayDeque<Integer>();
        qu_x.add(x1);
        qu_y.add(x2);
        qu_val.add(0);
        kt[x1][x2] = false;
        while (qu_x.size() > 0 && qu_y.size() > 0) {
            int x = qu_x.peek();
            int y = qu_y.peek();
            int dem = qu_val.peek();

            qu_x.poll();
            qu_y.poll();
            qu_val.poll();
            if (x == x3 && y == x4) {
                System.out.println(dem);
                break;
            }
            for (int i = x + 1; i < n; i++) {
                if (a[i][y] == 'X') {
                    break;
                }
                if (a[i][y] == '.' && kt[i][y] == true) {
                    qu_x.add(i);
                    qu_y.add(y);
                    qu_val.add(dem + 1);
                    kt[i][y] = false;
                }
            }
            for (int i = y + 1; i < n; i++) {
                if (a[x][i] == 'X') {
                    break;
                }
                if (a[x][i] == '.' && kt[x][i] == true) {
                    qu_x.add(x);
                    qu_y.add(i);
                    qu_val.add(dem + 1);
                    kt[x][y] = false;
                }
            }
            for (int i = x - 1; i >= 0; i--) {
                if (a[i][y] == 'X') {
                    break;
                }
                if (a[i][y] == '.' && kt[i][y] == true) {
                    qu_x.add(i);
                    qu_y.add(y);
                    qu_val.add(dem + 1);
                    kt[i][y] = false;
                }

            }
            for (int i = y - 1; i >= 0; i--) {
                if (a[x][i] == 'X') {
                    break;
                }
                if (a[x][i] == '.' && kt[x][i] == true) {
                    qu_x.add(x);
                    qu_y.add(i);
                    qu_val.add(dem + 1);
                    kt[x][y] = false;
                }
            }

        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            n = sc.nextInt();
            a = new char[n + 1][n + 1];
            kt = new boolean[n + 1][n + 1];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 0; j < n; j++) {
                    a[i][j] = s.charAt(j);
                    kt[i][j] = true;
                }
            }
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            x3 = sc.nextInt();
            x4 = sc.nextInt();
            tim_duong();
        }

    }
}
