
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
public class DiaChiEmail {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int k = sr.nextInt();
        sr.nextLine();
        while (k > 0) {
            k--;
            String s = sr.nextLine();
            s = s.trim();
            s.toLowerCase();
            String kq = "";

            String[] a = s.split("\\s+");

            for (String x : a) {
                x = x.toLowerCase();
                kq = kq + x.substring(0, 1).toUpperCase() + x.substring(1) + " ";

            }
            System.out.println(kq);
        }

    }
}
