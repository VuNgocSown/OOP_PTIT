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
public class J03013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            if (s1.length() < s2.length()) {
                String tmp = s1;
                s1 = s2;
                s2 = tmp;
            } else if (s1.length() == s2.length()) {
                if (s1.compareTo(s2) < 0) {
                    String tmp = s1;
                    s1 = s2;
                    s2 = tmp;
                }
            }
            BigInteger num1 = new BigInteger(s1);
            BigInteger num2 = new BigInteger(s2);
            System.out.println(num1.subtract(num2));
            String result = num1.subtract(num2).toString();
            if (result.length() < s1.length()) {
                for (int i = 0; i < s1.length() - result.length(); i++) {
                    result = '0' + result;
                }
            }
            System.out.println(result);
        }
    }
}
