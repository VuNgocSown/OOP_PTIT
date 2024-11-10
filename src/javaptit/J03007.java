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
public class J03007 {
    public static boolean check(String s){
        char[] c = s.toCharArray();
        if(c[0]!='8' || c[c.length-1]!='8'){
            return false;
        }
        int sum = 0;
        for(int i=0; i<c.length; i++){
            sum += c[i]-'0';
        }
        if(sum % 10==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    
    }
}
