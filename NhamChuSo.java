/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NhamChuSo {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int m, n;
        m = sr.nextInt();
        n = sr.nextInt();
        int tong = m + n;
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        String s1 = String.valueOf(m);
        String s2 = String.valueOf(n);
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        int tong_a = 0, tong_b = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (a[i] == '5') {
                a[i] = '6';
            } else if (a[i] == '6') {
                a[i] = '5';
            }
            tong_a = tong_a * 10 + a[i] - '0';
        }

        for (int i = 0; i < s2.length(); i++) {
            if (b[i] == '5') {
                b[i] = '6';
            } else if (b[i] == '6') {
                b[i] = '5';
            }
            tong_b = tong_b * 10 + b[i] - '0';
        }

        int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (a[i] == '5') {
                a[i] = '6';
            }
            t1 = t1 * 10 + a[i] - '0';
        }
        for (int i = 0; i < s1.length(); i++) {
            if (a[i] == '6') {
                a[i] = '5';
            }
            t2 = t2 * 10 + a[i] - '0';
        }
        for (int i = 0; i < s2.length(); i++) {
            if (b[i] == '5') {
                b[i] = '6';
            }
            t3 = t3 * 10 + b[i] - '0';
        }
        for (int i = 0; i < s2.length(); i++) {
            if (b[i] == '6') {
                b[i] = '5';
            }
            t4 = t4 * 10 + b[i] - '0';
        }
        arr1.add(m);
        arr1.add(tong_a);
        arr1.add(t1);
        arr1.add(t2);
        arr2.add(n);
        arr2.add(tong_b);
        arr2.add(t3);
        arr2.add(t4);
        Collections.sort(arr1);
        Collections.sort(arr2);

        int x = arr1.get(0) + arr2.get(0);
        int y = arr1.get(3) + arr2.get(3);
        System.out.println(x + " " + y);
    }
}
