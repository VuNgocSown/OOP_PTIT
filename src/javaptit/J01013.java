/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;

public class J01013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum=0;
        for(int i=1; i<=t; i++){
            int n = sc.nextInt();
            for(int j=2; j<=Math.sqrt(n); j++){
                if(n%j==0)
                {
                    while(n%j==0)
                    {
                        sum+=j;
                        n/=j;
                    }
                }
            }
            if(n!=1){
                sum+=n;
            }
        }
        System.out.println(sum);
    }
}
