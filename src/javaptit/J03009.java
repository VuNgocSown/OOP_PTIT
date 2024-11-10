/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author 84971
 */
public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] arr1 = s1.split("\\s+");
            String[] arr2 = s2.split("\\s+");
            TreeSet<String> se = new TreeSet<>();
            for(int i=0; i<arr1.length; i++){
                boolean check = false;
                for(int j=0; j<arr2.length; j++){
                    if(arr1[i].compareTo(arr2[j])==0){
                        check = true;
                    }
                }
                if(!check){
                    se.add(arr1[i]);
                }
            }
            for(String x : se){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
