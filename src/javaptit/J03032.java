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
public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            for(String x : arr){
                StringBuilder sb = new StringBuilder(x);
                x = sb.reverse().toString();
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
