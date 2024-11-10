/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class J03033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s1= sc.next();
            String s2 = sc.next();
            BigInteger num1 = new BigInteger(s1);
            BigInteger num2 = new BigInteger(s2);
            BigInteger ucln = num1.gcd(num2);
            BigInteger bcnn = num1.multiply(num2).divide(ucln);
            System.out.println(bcnn);
        }
    }
}
