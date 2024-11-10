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
public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        long salary = sc.nextLong();
        String cv = id.substring(0, 2);
        int hs = Integer.parseInt(id.substring(2));
        int pc;
        if(cv.compareTo("HT")==0){
            pc=2000000;
        }
        else if(cv.compareTo("HP")==0){
            pc=900000;
        }
        else{
            pc=500000;
        }
        System.out.println(id + " " + name + " " + hs + " " + pc + " " + (salary*hs+pc));
    }
}
