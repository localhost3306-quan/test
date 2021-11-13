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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class GiaTriNhoNhatCuaXau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int k = sc.nextInt();
            String s = sc.next();
            Map<Character, Integer> map = new TreeMap<Character, Integer>();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = 0; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), 1);

                } else {
                    int x = map.get(s.charAt(i));
                    x++;
                    map.put(s.charAt(i), x);
                }
            }
            Set<Character> set = map.keySet();
            for (Character key : set) {
                arr.add(map.get(key));
            }

            int n = arr.size() - 1;
            for (int i = 0; i < k; i++) {
                Collections.sort(arr);
                int a = arr.get(arr.size() - 1) - 1;
                arr.remove(arr.size() - 1);
                arr.add(a);
            }
            long kq = 0;
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) != 0) {
                    kq += (long) Math.pow(arr.get(i), 2);
                }
            }
            System.out.println(kq);
        }

    }
}
