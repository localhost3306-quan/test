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

public class So0VaSo9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n;
            n = sc.nextInt();
            Queue<String> qu = new ArrayDeque<String>();

            qu.add("9");
            int x = Integer.parseInt(qu.peek());
            while (x % n != 0) {
                String a = qu.peek();
                qu.poll();
                x = Integer.parseInt(a);
                String t1 = a + '0';
                String t2 = a + '9';
                qu.add(t1);
                qu.add(t2);
            }
            System.out.println(x);

        }
    }
}
