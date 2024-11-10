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
public class J01007 {
    static long[] fi= new long[93];
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t-- > 0)
        {
            long n;
            n = sc.nextLong();
            fibo();
            boolean check=false;
            for(int i=0; i<=92; i++){
                if(n==fi[i]){
                    System.out.println("YES");
                    check=true;
                    break;
                }
            }
            if(check==false){
                System.out.println("NO");
            }
        }
    }
    public static void fibo()
    {
        fi[0]=1;
        fi[1]=1;
        for(int i=2; i<=92; i++)
        {
            fi[i]=fi[i-1]+fi[i-2];
        }   
    }
}
