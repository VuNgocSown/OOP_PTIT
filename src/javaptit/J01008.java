/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 84971
 */
import java.util.Scanner;
public class J01008 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t = sc.nextInt();
        int cnt=1;
        while(t-- > 0)
        {
            int n;
            n = sc.nextInt();
            System.out.print("Test "+cnt+": ");
            for(int i=2; i<=Math.sqrt(n); i++)
            {
                if(n%i==0)
                {
                    int mu=0;
                    while(n%i==0)
                    {
                        n/=i;
                        mu++;
                    }
                    System.out.print(i+"("+mu+") ");
                }
            }
            if(n!=1)
            {
                System.out.print(n+"("+1+")");
            }
            System.out.println();
            cnt++;
        }
    }
}
