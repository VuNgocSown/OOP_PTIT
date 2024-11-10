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
public class J03040 {
    public static boolean equal(String s){
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)!= s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
    public static boolean tc(String s){
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) <= s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
    public static boolean lp(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='6' && s.charAt(i)!='8'){
                return false;
            }
        }
        return true;
    }
    public static boolean kt(String s){
        if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            s = s.substring(5);
            s = s.substring(0, 3) + s.substring(4);
            if(equal(s) || tc(s) || lp(s) || kt(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
