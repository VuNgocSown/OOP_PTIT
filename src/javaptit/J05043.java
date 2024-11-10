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
public class J05043 {
    public static class NV{
        private static int counter = 0;
        private String id;
        private String name;
        private String position;
        private long salaryDay;
        private long workingDay;

        public NV(String name, String position, long salaryDay, long workingDay) {
            this.id = generateId();
            this.name = name;
            this.position = position;
            this.salaryDay = salaryDay;
            this.workingDay = workingDay;
        }
        public static String generateId(){
            return String.format("NV%02d", ++counter);
        }
        public long cv(){
            if(position.compareTo("GD")==0){
                return 500;
            }
            else if(position.compareTo("PGD")==0){
                return 400;
            }
            else if(position.compareTo("TP")==0){
                return 300;
            }
            else if(position.compareTo("KT")==0){
                return 250;
            }
            else{
                return 100;
            }
        }
        public long salary(){
            return salaryDay*workingDay;
        }
        public long borrow(){
            if((float)(cv()+salary())*2/3<25000){
                return Math.round(((cv()+salary())*2/3)/1000)*1000;
            }
            return 25000;
        }
        @Override
        public String toString(){
            return id+" "+name+" "+cv()+" "+salary()+" "+borrow()+" "+(salary()-borrow()+cv());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NV[] nvs = new NV[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            nvs[i] = new NV(sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLong(),sc.nextLong());
        }
        for(NV nv:nvs){
            System.out.println(nv);
        }
    }
}