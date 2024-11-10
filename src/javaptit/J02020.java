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
public class J02020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i]=i;
        }
        int cnt = 0;
        while(true){
            cnt ++;
            for(int i=1; i<=k; i++){
                System.out.print(arr[i]+"");
            }
            System.out.print(" ");
            int i = k;
            while(arr[i]==n-k+i && i > 0){
                i--;
            }
            if(i==0){
                break;
            }
            else{
                arr[i]++;
                for(int j = i+1; j<=k; j++){
                    arr[j]=arr[j-1]+1;
                }
            }
        }
        System.out.println();
        System.out.println("Tong cong co "+cnt+" to hop");
    }
}
