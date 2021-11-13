
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
public class TinhTongCacChuSo {

    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while (k > 0) {
            k--;
            int tong = 0;
            String s = sc.next();
            char[] chuoi = new char[s.length()];
            chuoi = s.toCharArray();
            int n = s.length();
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (chuoi[i] > chuoi[j]) {
                        char a = chuoi[i];
                        chuoi[i] = chuoi[j];
                        chuoi[j] = a;
                    }
                }
            }
            String kq = "";
            for (int i = 0; i < n; i++) {
                if (chuoi[i] >= '0' && chuoi[i] <= '9') {
                    tong = tong + chuoi[i] - '0';
                } else {
                    kq = kq + chuoi[i];
                }
            }
            System.out.println(kq + tong);
        }
    }
}
