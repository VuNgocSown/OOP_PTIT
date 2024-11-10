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
public class J03006 {
    public static boolean check(String s){
        char[] c = s.toCharArray();
        for(int i=0; i<c.length; i++){
            if((c[i]-'0')%2!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
//        sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            String tmp = s;
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            s = sb.toString();
            if(check(s) && s.compareTo(tmp)==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
