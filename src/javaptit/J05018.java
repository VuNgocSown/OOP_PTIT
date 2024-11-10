/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class J05018 {
    public static class SV{
        private static int counter =0;
        private String id;
        private String name;
        private double m1;
        private double m2;
        private double m3;
        private double m4;
        private double m5;
        private double m6;
        private double m7;
        private double m8;
        private double m9;
        private double m10;

        public SV(String name, double m1, double m2, double m3, double m4, double m5, double m6, double m7, double m8, double m9, double m10) {
            this.id = generateId();
            this.name = name;
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
            this.m4 = m4;
            this.m5 = m5;
            this.m6 = m6;
            this.m7 = m7;
            this.m8 = m8;
            this.m9 = m9;
            this.m10 = m10;
        }
        public static String generateId(){
            counter++;
            return String.format("HS%02d", counter);
        }
        public double average() {
            double avg = (m1*2 + m2*2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10) / 12;
            return Math.round(avg * 10) / 10.0;
        }
        public String HK(){
            double grade = average();
            if(grade >= 9) return "XUAT SAC";
            else if(grade >=8 && grade < 9) return "GIOI";
            else if(grade>=7 && grade < 8) return "KHA";
            else if(grade>=5 && grade < 7) return "TB";
            else return "YEU";
        }
        public String getId(){
            return this.id;
        }
        @Override
        public String toString(){
            return this.id+" "+this.name+" "+String.format("%.1f",average())+" "+HK();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        SV[] svs = new SV[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            svs[i] = new SV(sc.nextLine(),sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(svs, new Comparator<SV>(){
            @Override
            public int compare(SV sv1, SV sv2){
                if(sv1.average()!=sv2.average()){
                    return Double.compare(sv2.average(), sv1.average());
                }
                return sv1.getId().compareTo(sv2.getId());
            }
        });
        for(SV sv:svs){
            System.out.println(sv);
        }
    }
}
