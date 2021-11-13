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
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class QuayHinhVuong {

    public static int start, end;
    public static Map<Integer, Boolean> map;

    public static void chuyen_doi() {
        Queue<Integer> qu = new ArrayDeque<Integer>();
        Queue<Integer> qu_val = new ArrayDeque<Integer>();
        qu.add(start);
        qu_val.add(0);
        map.put(start, false);
        while (qu.size() > 0) {
            int x = qu.peek();
            int dem = qu_val.peek();

            qu.poll();
            qu_val.poll();
            if (x == end) {
                System.out.println(dem);
                break;
            }
            char[] a = String.valueOf(x).toCharArray();
            char[] b = String.valueOf(x).toCharArray();
            char tg1 = a[4];
            a[4] = a[5];
            a[5] = a[2];
            a[2] = a[1];
            a[1] = tg1;

            char tg2 = b[3];
            b[3] = b[4];
            b[4] = b[1];
            b[1] = b[0];
            b[0] = tg2;
            int x1 = Integer.parseInt(String.valueOf(a));
            int x2 = Integer.parseInt(String.valueOf(b));
            if (!map.containsKey(x1)) {
                qu.add(x1);
                map.put(x1, false);
                qu_val.add(dem + 1);
            }
            if (!map.containsKey(x2)) {
                qu.add(x2);
                qu_val.add(dem + 1);
                map.put(x2, false);
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            start = 0;
            end = 0;
            int[] a = new int[8];
            int[] b = new int[8];
            for (int i = 1; i <= 6; i++) {
                a[i] = sc.nextInt();
                start = start * 10 + a[i];
            }
            for (int i = 1; i <= 6; i++) {
                b[i] = sc.nextInt();
                end = end * 10 + b[i];
            }
            map = new TreeMap<Integer, Boolean>();
            chuyen_doi();

        }

    }
}
