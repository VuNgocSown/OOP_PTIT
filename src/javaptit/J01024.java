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
public class J01024 {
    public static boolean check(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='2' && s.charAt(i)!='1' && s.charAt(i)!='0'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
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
