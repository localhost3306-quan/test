/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;
import java.util.Stack;

public class BieuThucDung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Stack<Character> stack = new Stack<>();
            int dem = 0;
            int kq = 0;
            for (int i = 0; i < s.length(); i++) {
                if (stack.size() == 0) {
                    stack.push(s.charAt(i));
                } else if (stack.peek() == '[' && s.charAt(i) == ']') {
                    stack.pop();
                    dem = dem + 2;
                } else if (stack.peek() == ']' && s.charAt(i) == '[') {
                    kq += stack.size() + dem;
                    stack.pop();
                } else if (s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                } else if (stack.peek() == ']' && s.charAt(i) == ']') {
                    stack.push(s.charAt(i));
                }
                if (stack.size() == 0) {
                    dem = 0;
                }
            }
            System.out.println(kq);
        }
    }

}
