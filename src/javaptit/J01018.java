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
public class J01018 {
    public static boolean sumNum(long n){
        int x = (int) (n % 10);
        int sum = (int) (n%10);
        n/=10;
        while(n>0){
            int end = (int) (n % 10);
            n /=10;
            sum+=end;
            if(Math.abs(end - x)!=2){
                return false;
            }
            x = end;
        }
        return sum%10 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            if(sumNum(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
