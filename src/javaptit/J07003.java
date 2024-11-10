/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        String s = sc.next();
        while(s.length()>1){
            int n = s.length()/2;
            String s1 = s.substring(0, n);
            String s2 = s.substring(n);
            BigInteger num1 = new BigInteger(s1);
            BigInteger num2 = new BigInteger(s2);
            s = (num1.add(num2).toString());
            System.out.println(s);
        }
    }
}
