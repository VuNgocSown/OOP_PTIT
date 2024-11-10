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
public class J01011 {
    public static int ucln(int a, int b){
        if(b==0){
            return a;
        }
        return ucln(b, a%b);
    }
    public static long bcnn(int a, int b){
        return (a/ucln(a, b))*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(bcnn(a, b) + " " + ucln(a, b));
        }
    }
}
