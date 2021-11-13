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

public class TinhGiaTriBieuThucHauTo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            String s = sc.next();
            Stack<Integer> st = new Stack<Integer>();
            st.push(s.charAt(0) - '0');
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == '%' || s.charAt(i) == '^') {
                    int b = st.peek();
                    st.pop();
                    int a = st.peek();
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
