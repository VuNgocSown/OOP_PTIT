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
public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i]=sc.nextInt();
            }
            int sum = 0;
            int midSum = 0;
            boolean check = false;
            for(int i=0; i<n; i++){
                sum += a[i];
            }
            for(int i=0; i<n; i++){
                if(midSum == (sum-a[i])/2){
                    System.out.println(i+1);
                    check=true;
                    break;
                }
                midSum += a[i];
            }
            if(check==false){
                System.out.println("-1");
            }
        }
    }
}
