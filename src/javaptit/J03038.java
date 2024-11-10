/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-- > 0){
            String s = sc.next();
            HashSet<Character> se = new HashSet<>();
            for(int i=0; i<s.length(); i++){
                se.add(s.charAt(i));
            }
            System.out.println(se.size());
        }
    }
}
