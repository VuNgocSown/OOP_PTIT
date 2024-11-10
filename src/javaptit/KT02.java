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
public class KT02 {
    public static class GV{
        private static int counter = 0;
        private String id;
        private String name;
        private double hs;
        private String kk;
        private int time;

        public GV(String name, double hs, String kk, int time) {
            this.id = generateId();
            this.name = name;
            this.hs = hs;
            this.kk = kk;
            this.time = time;
        }
        public static String generateId(){
            return String.format("PM%03d", ++counter);
        }
        public static double convertKK(String kk){
            if(kk.compareTo("A")==0){
                return 1.5;
            }
            else if(kk.compareTo("B")==0){
                return 1.2;
            }
            else{
                return 1.0;
            }
        }
        public static double truLuong(int time){
            if(time <= 100){
                return 0.15;
            }
            else if(time <= 350){
                return 0.1;
            }
            else if(time <= 499){
                return 0.05;
            }
            else{
                return 0;
            }
        }
        @Override
        public String toString(){
            return id+" "+name+" "+hs+" "+kk+" "+time+" "+Math.round(hs*convertKK(kk)*3000-hs*convertKK(kk)*3000*truLuong(time));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GV[] gvs = new GV[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double hs = sc.nextDouble();
            String kk = sc.next();
            int time = sc.nextInt();
            gvs[i]= new GV(name, hs, kk, time);
        }
        for(GV gv:gvs){
            System.out.println(gv);
        }
    }
}
