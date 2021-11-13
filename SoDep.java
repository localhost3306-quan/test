
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
public class SoDep {
    public static boolean kiemtra(char a[]) {
		int kt = 0, mid;
		int n = a.length;
		if ( n % 2 == 0) mid = n/2; else mid = n/2 +1;  
		int i = 0;
		while( i <= mid) {
			if (a[i] != a[n-i-1] ) return false;
			int p = a[i] - '0';
			if ( p % 2 != 0) return false;
			 i++;
			
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		while(k>0) {
			k--;
			String s = sc.next();
			char []  a= s.toCharArray();
			if ( kiemtra(a)) System.out.println("YES");
			else System.out.println("NO");
			
		}
	}
}
