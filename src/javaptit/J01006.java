/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

/**
 *
 * @author 84971
 */
import java.util.Scanner;
public class J01006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t-- > 0)
        {
            int n;
            n = sc.nextInt();
            System.out.println(fibo(n));
        }
    }
    public static long fibo(int n){
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 1;
        }
        int f1=1, f2=1;
        for(int i=3; i<=n; i++)
        {
            int tmp=f1;
            f1=f2;
            f2=tmp+f2;
        }
        return f2;
    }
    
}
