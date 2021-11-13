
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
public class sofibo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int kq = sc.nextInt();
            long[] a = new long[95];
            a[1] = 1;
            a[2] = 1;
            for (int i = 3; i <= kq; i++) {
                a[i] = a[i - 1] + a[i - 2];
            }
            System.out.println(a[kq]);
        }
    }
}
