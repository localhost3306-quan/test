/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.HashMap;
import java.util.Scanner;

public class PhanSoDonVi {

    public static long a, b;

    public static void In_don_vi(long p, long q) {
        if (p == 0 || q == 0) {
            return;
        }
        if (q % p == 0) {
            System.out.println("1/" + q / p);
            return;
        }
        long n = q / p + 1;
        System.out.print("1/" + n + " + ");
        In_don_vi(p * n - q, q * n);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sr = new Scanner(System.in);
        int tc = sr.nextInt();
        while (tc > 0) {
            tc--;
            a = sr.nextLong();
            b = sr.nextLong();
            In_don_vi(a, b);

        }
    }
}
