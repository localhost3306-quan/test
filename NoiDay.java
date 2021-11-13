
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class NoiDay {

    final static int base = 1000000007;

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int tc = sr.nextInt();
        while (tc > 0) {
            tc--;
            int n = sr.nextInt();
            long[] a = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = sr.nextLong();
            }
            long kq = 0;
            PriorityQueue<Long> qu = new PriorityQueue<Long>();
            for (int i = n; i > 0; i--) {
                qu.add(a[i]);
            }
            while (qu.size() > 1) {
                long x = (long) qu.poll();
                long y = (long) qu.poll();
                long sl = (x + y) % base;
                kq = (kq + sl) % base;
                qu.add(sl);

            }

            System.out.println(kq);

        }
    }
}
