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

public class DiChuyenTrongMaTran {

    public static int m, n;
    public static int dem = 0;
    public static int[] truoc_x, truoc_y;
    public static int[][] a;
    public static boolean[][] b;
    public static boolean kt;

    public static void tim_duong() {
        Queue<Integer> qu_x = new ArrayDeque<Integer>();
        Queue<Integer> qu_y = new ArrayDeque<Integer>();
        Queue<Integer> qu_Val = new ArrayDeque<Integer>();
        qu_x.add(1);
        qu_y.add(1);
        qu_Val.add(0);
        b[1][1] = false;
        while (qu_x.size() > 0 && qu_y.size() > 0) {
            int gia_tri = qu_Val.peek();
            int vt_x = qu_x.peek();
            int vt_y = qu_y.peek();

            qu_x.poll();
            qu_y.poll();
            qu_Val.poll();
            if (vt_x == m && vt_y == n) {
                System.out.println(gia_tri);
                kt = false;
                break;
            }

            int x = vt_x + a[vt_x][vt_y];
            if (x <= m && b[x][vt_y]) {
                qu_x.add(x);
                qu_y.add(vt_y);
                qu_Val.add(gia_tri + 1);
                b[x][vt_y] = false;
            }
            int y = vt_y + a[vt_x][vt_y];
            if (y <= n && b[vt_x][y]) {
                qu_x.add(vt_x);
                qu_Val.add(gia_tri + 1);
                qu_y.add(y);
                b[vt_x][y] = true;
            }

        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            m = sc.nextInt();
            n = sc.nextInt();
            a = new int[m + 1][n + 1];
            b = new boolean[m + 1][n + 1];
            truoc_x = new int[m + 1];
            truoc_y = new int[n + 1];
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    a[i][j] = sc.nextInt();
                    b[i][j] = true;
                }
            }
            kt = true;
            tim_duong();
            if (kt == true) {
                System.out.println("-1");
            }
        }

    }
}
