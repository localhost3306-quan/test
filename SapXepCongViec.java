
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pc
 */
public class SapXepCongViec {

    public static int[] a, b;
    public static int n;

    public static void swap(int i, int j) {
        int tg;
        tg = a[i];
        a[i] = a[j];
        a[j] = tg;
        tg = b[i];
        b[i] = b[j];
        b[j] = tg;
    }

    public static void qsort(int a[], int start, int end) {
        // quicksort theo thời gian kết thúc
        if (start >= end) {
            return;
        }
        int index = (end - start) / 2 + start;
        int pivot = a[index];
        int k = start - 1;
        swap(index, end);
        for (int i = start; i < end; i++) {
            if (a[i] < pivot) {
                k++;
                swap(i, k);
            }
        }
        k++;
        swap(k, end);
        qsort(a, start, k - 1);
        qsort(a, k + 1, end);
    }

    public static void proc() {
        // xử lí
        int res = 1;
        int end = b[0];
        for (int i = 1; i < n; i++) {
            if (b[i] == end) {
                continue;
            }
            if (a[i] >= end) {
                res++;
                end = b[i];
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sr = new Scanner(System.in);
        int tc = sr.nextInt();
        while (tc > 0) {
            tc--;
            n = sr.nextInt();
            a = new int[n + 1];
            b = new int[n + 1];

            for (int i = 0; i < n; i++) {
                a[i] = sr.nextInt();
                b[i] = sr.nextInt();
            }
            qsort(b, 0, n - 1); // sort theo thời gian kết thúc
            proc();
        }
    }
}
