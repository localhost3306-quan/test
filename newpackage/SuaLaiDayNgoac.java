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

public class SuaLaiDayNgoac {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            String s = sc.next();
            Stack<Character> st = new Stack<Character>();
            int dem = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == ')' && st.size() == 0) {
                    st.push(s.charAt(i));
                } else if (s.charAt(i) == ')') {
                    if (st.size() > 0 && st.peek() == '(') {
                        st.pop();
                    } else {
                        st.push(s.charAt(i));
                    }
                }
            }
            int d1 = 0, d2 = 0;
            while (!st.isEmpty()) {
                if (st.peek() == '(') {
                    d1++;
                } else {
                    d2++;
                }
                st.pop();
            }
            int kq = d1 / 2 + d2 / 2 + d1 % 2 + d2 % 2;
            System.out.println(kq);
        }
    }
}
