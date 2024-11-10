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
public class J02022 {
    public static int check(int arr[], int n){
        for(int i=2; i<=n; i++){
            if(Math.abs(arr[i]-arr[i-1])==1){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            for(int i=1; i<=n; i++){
                arr[i]=i;
            }
            while(true){
                if(check(arr, n)==1){
                    for(int i=1; i<=n; i++){
                        System.out.print(arr[i]);
                    }
                    System.out.println();
                }
                int j = n-1, k=n;
                while(arr[j]>arr[j+1] && j >= 0){
                    j--;
                }
                if(j==0){
                    break;
                }
                else{
                    while(arr[k]<arr[j]){
                        k--;
                    }
                    int tmp = arr[j];
                    arr[j]=arr[k];
                    arr[k]=tmp;
                    int l = j+1, r = n;
                    while(l<r){
                        int temp = arr[l];
                        arr[l]=arr[r];
                        arr[r]=temp;
                        l++;
                        r--;
                    }
                }
            }
            System.out.println("");
        }
    }
}
