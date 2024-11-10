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
public class J01009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n = sc.nextInt();
        long sum=0;
        long gt=1;
        for(int i=1; i<=n; i++){
            sum += gt*i;
            gt*=i;
        }
        System.out.println(sum);
    }
}
