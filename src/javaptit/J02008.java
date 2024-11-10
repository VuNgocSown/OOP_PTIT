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
public class J02008 {
    public static long ucln(long a, long b){
        if(b==0){
            return a;
        }
        return ucln(b, a%b);
    }
    public static long bcnn(long a, long b){
        return (a/ucln(a, b))*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextInt();
            long bs = n;
            for(int i=1; i<=n; i++){
                bs = bcnn(bs, i);
            }
            System.out.println(bs);
        }
    }
}
