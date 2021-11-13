/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class DayCon {
    static int a[], c[],n,k;
    
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int t = in.nextInt();
        
        while(t-- > 0){
            n = in.nextInt(); k = in.nextInt();
            a = new int[n+1];
            c = new int[21];
            
            for(int  i = 1;i<=n;i++){
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            backTracking(1);
        }
    }
    
    public static void backTracking(int i){
        for(int j = c[i-1]+1 ; j<=n-k+i;j++){
            c[i] = j;
            if(i==k){
                print();
            }else{
                backTracking(i+1);
            }
        }
    }
    
    public static void print(){
        for(int i =1;i <=k; i++){
            System.out.print(a[c[i]]+ " ");
        }
        System.out.println("");
    }
}
