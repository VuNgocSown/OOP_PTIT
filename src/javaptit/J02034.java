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
public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] cnt = new int[205];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
            cnt[a[i]]++;
        }
        boolean check = false;
        int max_val = 0;
        for(int i=0; i<n; i++){
            max_val = Math.max(max_val, a[i]);
        }
        for(int i=1; i<=max_val; i++){
            if(cnt[i]==0){
                check = true;
                System.out.println(i);
            }
        }
        if(!check){
            System.out.println("Exellent!");
        }
    }
}
