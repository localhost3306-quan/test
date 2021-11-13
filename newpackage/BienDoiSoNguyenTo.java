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
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

public class BienDoiSoNguyenTo {

    public static int start, end;
    public static boolean[] kt;
    public static int[] dem, d;
    public static Map<Integer, Boolean> map;
    public static Map<Integer, ArrayList<Integer>> ke;
    public static Queue<Integer> qu;

    static void sang() {
        for (int i = 2; i <= 9999; i++) {
            if (d[i] == 0) {
                for (int j = i * i; j <= 9999; j += i) {
                    d[j] = 1;
                }
            }
        }
        for (int i = 1000; i <= 9999; i++) {
            if (d[i] == 0) {
                map.put(i, true);
            }
        }
    }

    static boolean ktra(long x, long y) {
        int dd = 0;
        while (x > 0 && y > 0) {
            if (x % 10 != y % 10) {
                dd++;
            }
            x /= 10;
            y /= 10;
        }
        return dd == 1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        d = new int[10000];
        ke = new TreeMap<Integer, ArrayList<Integer>>();

        int tc = sc.nextInt();
        while (tc-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            for (int i = 1; i <= 9999; i++) {
                d[i] = 0;
            }
            map = new TreeMap<Integer, Boolean>();
            sang();
            qu = new ArrayDeque<Integer>();
            Queue<Integer> qu_val = new ArrayDeque<Integer>();
            qu.add(m);
            qu_val.add(0);
            map.put(m, false);
            char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
            while (qu.size() > 0) {
                int x = qu.peek();
                int dem = qu_val.peek();
                qu.poll();
                qu_val.poll();

                if (x == n) {
                    System.out.println(dem);
                    break;
                }
                for (int i = 3; i >= 0; i--) {

                    for (int j = 0; j <= 9; j++) {
                        char chuoi[] = String.valueOf(x).toCharArray();

                        chuoi[i] = (char) b[j];
                        int ll = Integer.parseInt(String.valueOf(chuoi));
                        if (map.containsKey(ll) && map.get(ll) == true) {
                            qu.add(ll);
                            qu_val.add(dem + 1);
                            map.put(ll, false);
                        }
                    }

                }
            }
        }
    }
}
