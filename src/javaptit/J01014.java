/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class J01014 {
    public static boolean nto(long n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long max_val=0;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    long x = n/i;
                    if(nto(x)){
                        max_val=Math.max(max_val, x);
                    }
                    if(nto(i)){
                        max_val=Math.max(max_val, i);
                    }
                }
            }
            if(max_val==0){
                System.out.println(n);
            }
            else{
                System.out.println(max_val);
            }
        }
    }
}
