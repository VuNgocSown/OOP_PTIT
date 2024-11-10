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
public class J04007 {
    public static class NV{
        private String id = "00001";
        private String name;
        private String gender;
        private String birth;
        private String address;
        private String tax;
        private String contract;
        public NV(String name, String gender, String birth, String address, String tax, String contract){
            this.name = name;
            this.gender = gender;
            this.birth = birth;
            this.address =address;
            this.tax = tax;
            this.contract = contract;
        }
        public void output(){
            System.out.println(this.id + " " + this.name + " " + this.gender + " " + this.birth + " " + this.address + " "+ this.tax + " " + this.contract);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String gender = sc.nextLine();
        String birth = sc.nextLine();
        String address = sc.nextLine();
        String tax = sc.nextLine();
        String contract = sc.nextLine();
        NV nv = new NV(name, gender, birth, address, tax, contract);
        nv.output();
    }
}
