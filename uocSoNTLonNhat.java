
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
public class uocSoNTLonNhat {
    public static boolean so_nguyen_to(long n) {
		if (n <= 1)  return false;
	    if (n <= 3)  return true;
	    if (n%2 == 0 || n%3 == 0) return false;

	    for (long i=5; i*i<=n; i=i+6)
	        if (n%i == 0 || n%(i+2) == 0)
	           return false;

	    return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int k = sc.nextInt();
		  while( k > 0) {
			  k--;
			  long n = sc.nextLong();
			  long kq = 0;
			  if ( so_nguyen_to(n)) System.out.println(n);
			  else {
			  for ( long i = 2; i *i <= n ; i++) {
				  if ( n % i == 0) {
					  long x = n/i;
					  if ( so_nguyen_to(x)) kq= x ;
					  else if ( so_nguyen_to(i)) kq =i;
				  }
			  }
			  System.out.println(kq);
			  }
			
		  }

	}
}
