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

public class KiemTraBieuThucSoHoc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            String s = sc.next();
            Stack<Character> st = new Stack<Character>();
            boolean kt = true;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ')') {
                    kt = true;
                    char x = st.peek();
                    st.pop();
                    while (x != '(') {
                        if (x == '+' || x == '-' || x == '*' || x == '/') {
                            kt = false;
                        }
                        x = st.peek();
                        st.pop();
                    }
                    if (kt) {
                        break;
                    }
                } else {
                    st.push(s.charAt(i));
                }
            }
            if (kt) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }

}
