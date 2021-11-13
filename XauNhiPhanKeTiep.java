
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pc
 */
public class XauNhiPhanKeTiep {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int k = sr.nextInt();

        while (k > 0) {
            k--;

            String s = sr.next();
            char[] a = s.toCharArray();
            int n = s.length();
            int i = n;
            while (i > 0 && a[i - 1] == '1') {
                i--;
            }
            if (i > 0) {
                a[i - 1] = '1';
                for (int j = i; j < n; j++) {
                    a[j] = '0';
                }
                for (int j = 0; j < n; j++) {
                    System.out.print(a[j]);
                }
            } else {
                for (int j = 0; j < n; j++) {
                    a[j] = '0';
                }
                for (int j = 0; j < n; j++) {
                    System.out.print(a[j]);
                }
            }
            System.out.println();
        }
    }
}
