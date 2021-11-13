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

public class SoBDN2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            Queue<String> qu = new ArrayDeque<String>();
            qu.add("1");
            boolean kt = true;
            while (kt && qu.size() > 0) {
                String s = qu.peek();
                qu.poll();
                long a = 0;
                for (int i = 0; i < s.length(); i++) {
                    a = a * 10 + (int) (s.charAt(i) - '0');
                    a %= n;
                }
                if (a == 0) {
                    System.out.println(s);
                    kt = false;
                    break;
                }
                qu.add(s + "0");
                qu.add(s + "1");
            }

        }

    }
}
