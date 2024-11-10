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
public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();
        double dc;
        int kv = id.charAt(2)-'0';
        String dcp;
        if(kv==1){
            dc=0.5;
        }
        else if(kv==2){
            dc=1;
        }
        else{
            dc=2.5;
        }
        if((int)dc!=dc){
            dcp = String.format("%.1f", dc);
        }
        else{
            dcp=String.format("%d", (int)dc);
        }
        String summ;
        if((int)(m1*2+m2+m3)!=m1*2+m2+m3){
            summ = String.format("%.1f", m1*2+m2+m3);
        }
        else{
            summ = String.format("%d", (int)(m1*2+m2+m3));
        }
        String kq;
        if(m1*2+m2+m3+dc<24){
            kq="TRUOT";
        }
        else{
            kq="TRUNG TUYEN";
        }
        System.out.println(id+" "+name+" "+dcp+" "+summ+" "+kq);
    }
}
