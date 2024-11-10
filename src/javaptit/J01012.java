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
public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int cnt=0;
            for(int i=1; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    int x = n/i;
                    if(x == i){
                        if(x % 2 ==0){
                            cnt++;
                        }
                    }
                    else{
                        if(x%2==0){
                            cnt++;
                        }
                        if(i%2==0){
                            cnt++;
                        }
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
