/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class J07002 {
    public static boolean check(String s){
        if(s.length()>9){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        long sum = 0;
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)){
                sum += Integer.parseInt(s);
            }
        }
        System.out.println(sum);
    }
}
