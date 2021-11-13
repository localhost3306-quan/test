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

public class KiemTraDayNgoacDung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            String s = sc.next();
            Stack<Character> st = new Stack<Character>();
            if (s == "") {
                System.out.println("null");
            }
            boolean kt = true;
            for (int i = 0; i < s.length(); i++) {
                if (st.isEmpty()) {
                    st.push(s.charAt(i));
                } else {
                    if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                        st.push(s.charAt(i));
                    }
                    if (s.charAt(i) == ')' && (char) st.peek() == '(') {
                        st.pop();
                    }
                    if (s.charAt(i) == ']' && (char) st.peek() == '[') {
                        st.pop();
                    }
                    if (s.charAt(i) == '}' && (char) st.peek() == '{') {
                        st.pop();
                    }
                }

            }
            if (!st.isEmpty()) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }
}
