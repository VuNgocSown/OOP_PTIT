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
public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j=0; j<n; j++){
                a[j]=sc.nextInt();
            }
            int[] cd = new int[1000000];
            for(int j=0; j<n; j++){
                cd[a[j]]++;
            }
            System.out.println("Test " + i+":");
            for(int j=0; j<n; j++){
                if(cd[a[j]]!=0){
                    System.out.println(a[j]+" xuat hien "+cd[a[j]]+" lan");
                    cd[a[j]]=0;
                }
            }
        }
    }
}
