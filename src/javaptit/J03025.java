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
public class J03025 {
    public static int dx(String s){
        int cnt = 0;
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(s.length()%2!=0 && dx(s) <= 1){
                System.out.println("YES");
            }
            else if(s.length()%2==0 && dx(s) == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
