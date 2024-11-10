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
public class J05007 {
    public static class NV{
        private static int counter=0;
        private String id;
        private String name;
        private String gender;
        private String birth;
        private String address;
        private String tax;
        private String contract;

        public NV(String name, String gender, String birth, String address, String tax, String contract) {
            this.id = generateId();
            this.name = name;
            this.gender = gender;
            this.birth = birth;
            this.address = address;
            this.tax = tax;
            this.contract = contract;
        }
        public static String generateId(){
            counter++;
            return String.format("%05d", counter);
        }
        public String getBirth(){
            return this.birth;
        }
        @Override
        public String toString(){
            return this.id+" "+this.name+" "+this.gender+" "+this.birth+" "+this.address+" "+this.tax+" "+this.contract;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        NV[] nvs = new NV[t];
        sc.nextLine();
        for(int i=0; i<t; i++){
            nvs[i]=new NV(sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        Arrays.sort(nvs, new Comparator<NV>(){
           @Override
           public int compare(NV nv1, NV nv2){
               String d1 = nv1.getBirth().substring(0, 2);
               String m1 = nv1.getBirth().substring(3, 5);
               String y1 = nv1.getBirth().substring(6);
               String d2 = nv2.getBirth().substring(0, 2);
               String m2 = nv2.getBirth().substring(3,5);
               String y2 = nv2.getBirth().substring(6);
               if(y1.compareTo(y2)!=0){
                   return y1.compareTo(y2);
               }
               else if(m1.compareTo(m2)!=0){
                   return m1.compareTo(m2);
               }
               else{
                   return d1.compareTo(d2);
               }
           }
        });
        for(NV nv:nvs){
            System.out.println(nv);
        }
    }
}
