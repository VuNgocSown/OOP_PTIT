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

public class J05009 {
    public static class SV{
        private static int counter=0;
        private int id;
        private String name;
        private String birth;
        private double m1;
        private double m2;
        private double m3;
        public SV(String name,String birth, double m1, double m2, double m3){
            this.name = name;
            this.birth = birth;
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
            this.id = generateId();
        }
        public static int generateId(){
            counter++;
            return counter;
        }
        public double sumPoint(){
            return (this.m1 + this.m2 + this.m3);
        }
        @Override
        public String toString(){
            return this.id+" "+this.name+" "+this.birth+" "+this.sumPoint();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        SV[] svs = new SV[t];
        for(int i=0; i<t; i++){
            sc.nextLine();
            svs[i] = new SV(sc.nextLine(),sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        double max_val = 0;
        for(SV sv: svs){
            max_val = Math.max(sv.sumPoint(), max_val);
        }
        for(SV sv:svs){
            if(sv.sumPoint()==max_val){
                System.out.println(sv);
            }
        }
    }
}
