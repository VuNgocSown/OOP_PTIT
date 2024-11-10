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
public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int salary = sc.nextInt();
        int day = sc.nextInt();
        String cv = sc.next();
        int pc;
        double prize;
        if(cv.compareTo("GD")==0){
            pc=250000;
        }
        else if(cv.compareTo("PGD")==0){
            pc=200000;
        }
        else if(cv.compareTo("TP")==0){
            pc=180000;
        }
        else{
            pc=150000;
        }
        if(day>=25){
            prize=0.2;
        }
        else if(day>=22 && day<25){
            prize=0.1;
        }
        else{
            prize=0;
        }
        System.out.println("NV01"+" "+name+" "+salary*day+" "+(int)(salary*day*prize)+" "+pc+" "+(int)(salary*day*prize+salary*day+pc));
    }
}
