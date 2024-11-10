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
public class J01002 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t-- > 0){
            int N;
            N = sc.nextInt();
            long sum=(N*(N+1)/2);
            System.out.println(sum);
        }
    }
}
