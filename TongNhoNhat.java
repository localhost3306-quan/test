/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Arrays;
import java.util.Scanner;

public class TongNhoNhat {

    public static int n;

    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        int tc = sr.nextInt();
        while (tc > 0) {
            tc--;
            n = sr.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sr.nextInt();

            }

            Arrays.sort(b);

            String tong1 = "";
            String tong2 = "";
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    tong1 = tong1 + b[i];
                } else {
                    tong2 = tong2 + b[i];
                }
            }
            long tong = Long.parseLong(tong1) + Long.parseLong(tong2);
            System.out.println(tong);

        }
    }
}
