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
public class J05081 {
    public static class MH{
        private static int counter = 0;
        private String id;
        private String name;
        private String unit;
        private int bought;
        private int sell;
        public MH(String name, String unit, int bought, int sell){
            this.name = name;
            this.unit = unit;
            this.bought = bought;
            this.sell = sell;
            this.id = generateId();
        }
        public static String generateId(){
            counter++;
            return String.format("MH%03d", counter);
        }
        public String getId(){
            return this.id;
        }
        public int getBought(){
            return this.bought;
        }
        public int getSell(){
            return this.sell;
        }
        @Override
        public String toString(){
            return this.id + " " + this.name + " " + this.unit + " " + this.bought + " " + this.sell + " " + (this.sell-this.bought);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MH[] mhs = new MH[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            String unit = sc.nextLine();
            int bought = sc.nextInt();
            int sell = sc.nextInt();
            mhs[i]=new MH(name, unit, bought, sell);
        }
        Arrays.sort(mhs, new Comparator<MH>(){
            @Override
            public int compare(MH m1, MH m2){
            if((m1.sell-m1.bought)!=(m2.sell-m2.bought)){
                return (m2.sell-m2.bought)-(m1.sell-m1.bought);
            }
            else{
                return m1.getId().compareTo(m2.getId());
            }
        }
        });
        for(MH mh:mhs){
            System.out.println(mh);
        }
    }
}
