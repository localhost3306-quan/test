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
import java.util.Queue;
import java.util.Scanner;

public class SoBDN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            String s = sc.next();
            String a[] = s.split("");
            String res = "";
            for (int i = 0; i < a.length; i++) {
                if (a[i].equals("0") || a[i].equals("1")) {
                    res += a[i];
                } else {
                    for (int j = i; j < a.length; j++) {
                        res += "1";
                    }
                    break;
                }
            }
            int kq = Integer.parseInt(res, 2);
            System.out.println(kq);

        }

    }
}
