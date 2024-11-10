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
public class J03024 {
    public static boolean check(String s){
        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static boolean ut(String s){
        int l=0, c=0;
        for(int i=0; i<s.length(); i++){
            int num = s.charAt(i)-'0';
            if(num%2 == 0){
                c++;
            }
            else{
                l++;
            }
        }
        if(c>l){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(!check(s)){
                System.out.println("INVALID");
            }
            else{
                if(ut(s)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
