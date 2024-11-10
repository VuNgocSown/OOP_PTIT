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
public class J02013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            boolean check = false;
            for(int j=0; j<n-i-1; j++){
                if(a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                    check=true;
                }
            }
            if(check==false){
                break;
            }
            System.out.print("Buoc "+(i+1)+": ");
            for(int j=0; j<n; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
        
    }
}
