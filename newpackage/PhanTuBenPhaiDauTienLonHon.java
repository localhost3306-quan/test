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
import java.util.*;

public class PhanTuBenPhaiDauTienLonHon {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 2];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<Integer>();
            int[] R = new int[n + 2];
            a[n] = -1;
            for (int i = n - 1; i >= 0; i--) {
                while (!st.isEmpty() && a[st.peek()] <= a[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    R[i] = n;
                } else {
                    R[i] = st.peek();
                }
                st.push(i);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[R[i]] + " ");
            }
            System.out.println();
        }

    }
}
