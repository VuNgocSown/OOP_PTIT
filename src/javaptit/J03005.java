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
public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] arr = s.trim().split("\\s+");
            String result = "";
            for(int i=1; i<arr.length; i++){
                arr[i] = arr[i].toLowerCase();
                result += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1) + " ";
            }
            result = result.trim();
            result += ", " + arr[0].toUpperCase();
            System.out.println(result);
        }
    }
}
