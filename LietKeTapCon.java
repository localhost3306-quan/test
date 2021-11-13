
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class LietKeTapCon {

    public static int n;
    public static int[] a;
    public static String s;
    public static PriorityQueue<String> qu;

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int k = sr.nextInt();
        while (k > 0) {
            k--;
            n = sr.nextInt();
            String s = sr.next();
            a = new int[s.length() + 1];
            qu = new PriorityQueue<String>();
            for (int i = 0; i <= n; i++) {
                a[i] = 0;
            }
            for (int i = n - 1; i >= 0; i--) {

                if (a[i] == 0) {
                    String kq = "";
                    a[i] = 1;
                    int j;
                    for (j = i + 1; j < n; j++) {
                        a[j] = 0;
                    }

                    for (j = 0; j < n; j++) {
                        if (a[j] == 1) {
                            char x = s.charAt(j);
                            kq = kq + x;
                        }
                    }

                    i = n;
                    qu.add(kq);
                }

            }
            while (true) {

                String name = qu.poll();
                if (name == null) {
                    break;
                }
                System.out.print(name + " ");
            }
            System.out.println();

        }

    }
}
