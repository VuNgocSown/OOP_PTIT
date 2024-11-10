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
public class J03008 {
    public static boolean nt(int n){
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return n > 1;
    }
    public static boolean check(String s){
        char[] c = s.toCharArray();
        for(int i=0; i<c.length; i++){
//            System.out.println((c[i]-'0'));
            if(!nt(c[i]-'0')){
                return false; 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            String tmp = sb.toString();
            if(s.compareTo(tmp)==0 && check(s)){
                System.out.println("YES");
            } 
            else{
                System.out.println("NO");
            }
        }
    
    }
}
