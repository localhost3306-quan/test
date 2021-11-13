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

public class BienDoiHauToTienTo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            String s = sc.next();
            Stack<String> st = new Stack<String>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == '%' || s.charAt(i) == '^') {
                    String a = st.peek();
                    st.pop();
                    String b = st.peek();
                    st.pop();
                    String kq = s.charAt(i) + b + a;
                    st.push(kq);
                } else {
                    st.push(String.valueOf(s.charAt(i)));
                }
            }
            while (!st.empty()) {
                System.out.print(st.pop());
            }
            System.out.println();
        }
    }
}
