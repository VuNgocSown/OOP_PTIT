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
public class J01015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s = sc.next();
            boolean check=false;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)!='1' && s.charAt(i)!='0' && s.charAt(i)!='2'){
                    check=true;
                    break;
                }
            }
            if(!check){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
