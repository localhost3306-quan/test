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

public class SoNhiPhanTu1DenN {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n;
            n = sc.nextInt();
            Queue<String> qu = new ArrayDeque<String>();

            qu.add("1");
            int dem = 1;
            while (dem <= n) {
                String x = qu.peek();
                System.out.print(x + " ");
                qu.poll();
                String a1 = x + "0";
                String a2 = x + "1";
                qu.add(a1);
                dem++;
                qu.add(a2);
            }
            System.out.println();

        }
    }

}
