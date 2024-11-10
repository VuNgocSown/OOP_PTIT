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
public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='7' || s.charAt(i)=='4'){
                cnt++;
            }
        }
        if(cnt == 4 || cnt%4==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
