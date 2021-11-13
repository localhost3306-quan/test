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
import java.util.Scanner;
import java.util.Stack;

public class TinhGiaTriBieuThucTienTo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            String s = sc.next();
            Stack<Integer> st = new Stack<Integer>();
            st.push(s.charAt(s.length() - 1) - '0');
            for (int i = s.length() - 2; i >= 0; i--) {
                if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == '%' || s.charAt(i) == '^') {
                    int a = st.peek();
                    st.pop();
                    int b = st.peek();
                    st.pop();
                    int kq = 0;
                    if (s.charAt(i) == '+') {
                        kq = a + b;
                    } else if (s.charAt(i) == '-') {
                        kq = a - b;
                    } else if (s.charAt(i) == '*') {
                        kq = a * b;
                    } else if (s.charAt(i) == '/') {
                        kq = a / b;
                    } else if (s.charAt(i) == '%') {
                        kq = a % b;
                    } else if (s.charAt(i) == '^') {
                        kq = (int) Math.pow(a, b);
                    }
                    st.push(kq);
                } else {
                    st.push(s.charAt(i) - '0');
                }
            }
            System.out.println(st.peek());
        }

    }
}
