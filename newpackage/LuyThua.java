/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class LuyThua {

    static final int base = 1000000007;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(power(n, k));
        }

    }

    static long power(int a, long p) {
        if (p == 0) {
            return 1;
        }
        long x = (long) power(a, p / 2);
        if (p % 2 == 0) {
            return x * x % base;
        } else {
            return a * (x * x % base) % base;
        }
    }
}
