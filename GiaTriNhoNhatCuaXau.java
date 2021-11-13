/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GiaTriNhoNhatCuaXau {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test > 0) {

            int loai = input.nextInt();
            input.nextLine();
            String str = input.nextLine();
            String arr[] = str.split("");
            ArrayList<Integer> lists = new ArrayList<Integer>();
            String check = "";
            for (int i = 0; i < arr.length; i++) {
                if (!check.contains(arr[i])) {
                    check += arr[i];
                    int dem = 1;
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i].equals(arr[j])) {
                            dem++;
                        }
                    }
                    lists.add(dem);

                    dem = 1;
                }
            }
            for (int i = 0; i < loai; i++) {
                Collections.sort(lists);
                int a = lists.get(lists.size() - 1) - 1;
                lists.remove(lists.size() - 1);
                lists.add(a);

            }
            long kq = 0;
            for (int i = 0; i < lists.size(); i++) {
                if (lists.get(i) != 0) {
                    kq += (long) Math.pow(lists.get(i), 2);
                }
            }
            System.out.println(kq);
            test--;
        }

    }
}
