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
public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0; i<m; i++){
            b[i]=sc.nextInt();
        }
        int[] cd = new int[1000];
        for(int i=0; i<n; i++){
            cd[a[i]]=1;
        }
        for(int i=0; i<m; i++){
            if(cd[b[i]]==1){
                cd[b[i]]=2;
            }
        }
        for(int i=0; i<1000; i++){
            if(cd[i] == 2){
                System.out.print(i+" ");
            }
        }
    }
}
