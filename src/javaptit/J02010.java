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
public class J02010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            System.out.print("Buoc " + (i+1)+": ");
            for(int j=i+1; j<n; j++){
                if(a[i]>a[j]){
                    int c = a[i];
                    a[i]=a[j];
                    a[j]=c;
                }
            }
            for(int j=0; j<n; j++){
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
}
