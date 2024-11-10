/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> hm = new HashMap<>();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            for(int i=0; i < a.length; i++){
                a[i]=a[i].toLowerCase();
            }
            String result = "";
            result += a[a.length-1];
            for(int i=0; i<a.length-1; i++){
                result += a[i].charAt(0);
            }
            if(!hm.containsKey(result)){
                System.out.println(result + "@ptit.edu.vn");
                hm.put(result, 1);
            }
            else{
                int getValue = hm.get(result);
                hm.put(result, getValue+1);
                System.out.println(result + (getValue+1)+ "@ptit.edu.vn");
            }
        }
    }
}
