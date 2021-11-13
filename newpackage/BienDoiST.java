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
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class BienDoiST {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
            Queue<Integer> qu = new ArrayDeque<Integer>();
            map.put(n, 0);
            int dem = 0;
            qu.add(n);
            boolean kt = true;
            while (qu.size() > 0 && kt) {
                int a = qu.peek();

                qu.poll();
                if (a == k) {
                    kt = false;
                    System.out.println(map.get(a));
                    break;
                }
                if (a * 2 == k || a - 1 == k) {
                    kt = false;
                    System.out.println(map.get(a) + 1);
                    break;
                }
                if (!map.containsKey(a * 2) && a < k) {
                    map.put(a * 2, map.get(a) + 1);
                    qu.add(a * 2);
                }
                if ((a - 1) > 0 && !map.containsKey(a - 1)) {
                    map.put(a - 1, map.get(a) + 1);
                    qu.add(a - 1);
                }

            }

        }

    }
}
