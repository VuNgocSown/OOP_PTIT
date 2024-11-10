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
public class J01021 {
    static int mod = (int) (1e9 + 7);
    public static long luyThua(long a, long b){
        if(b == 0) return 1;
        if(b == 1) return a;
        long lt=luyThua(a, b/2);
        if(b % 2 == 0){
            return lt % mod * lt % mod;
        }
        else{
            return lt % mod * lt % mod * a % mod;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a==0 && b==0){
                break;
            }
            System.out.println(luyThua(a, b));
        }
    }
}
