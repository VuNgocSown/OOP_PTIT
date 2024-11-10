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
public class J05037 {
    public static class MH{
        private static int counter =0;
        private String id;
        private String name;
        private String unit;
        private double expo;
        private double quantity;

        public MH(String name, String unit, double expo, double quantity) {
            this.id = generateId();
            this.name = name;
            this.unit = unit;
            this.expo = expo;
            this.quantity = quantity;
        }
        public static String generateId(){
            return String.format("MH%02d", ++counter);
        }

        public double getExpo() {
            return expo;
        }

        public double getQuantity() {
            return quantity;
        }
        public double feeShip(){
            return expo*quantity*0.05;
        }
        public double totalInvest(){
            return expo*quantity + feeShip();
        }
        public double sell(){
            return Math.ceil((totalInvest()*0.02+totalInvest())/(quantity*100))*100;
        }
        @Override
        public String toString(){
            return id+" "+name+" "+unit+" "+String.format("%.0f %.0f %.0f", feeShip(), totalInvest(), sell());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MH[] mhs = new MH[n];
        for(int i=0; i<n; i++){
            mhs[i] = new MH(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(mhs, new Comparator<MH>() {
            @Override
            public int compare(MH mh1, MH mh2) {
                return Double.compare(mh2.sell(), mh1.sell());
            }
        });
        for(MH mh:mhs){
            System.out.println(mh);
        }
    }
}
