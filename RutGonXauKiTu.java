
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pc
 */
public class RutGonXauKiTu {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sr = new Scanner(System.in);
        String s = sr.next();
        char[] a = s.toCharArray();
        Stack<Character> st = new Stack<Character>();;

        st.push(a[0]);

        int i = 1, n = s.length();
        while (i < n) {

            if (st.isEmpty()) {
                st.push(a[i]);
            } else {
                if ((char) st.peek() == a[i]) {
                    st.pop();
                } else {
                    st.push(a[i]);
                }
            }
            i++;
        }
        if (st.isEmpty()) {
            System.out.println("Empty String");
        } else {
            String kq = "";
            while (!st.isEmpty()) {
                kq = kq + st.pop();
            }
            for (int j = kq.length() - 1; j >= 0; j--) {
                System.out.print(kq.charAt(j));
            }
        }
    }
}
