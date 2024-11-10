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
public class J05006 {
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
        for(NV nv:nvs){
            System.out.println(nv);
        }
    }
}
