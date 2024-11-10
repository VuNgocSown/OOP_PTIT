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
public class J04005 {
    public static class SinhVien{
        private String name;
        private String birth;
        private double m1;
        private double m2;
        private double m3;
        public SinhVien(String name, String birth, double m1, double m2, double m3){
            this.name = name;
            this.birth = birth;
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        }
        public void output(){
            System.out.print(this.name + " " + this.birth + " ");
            System.out.printf("%.1f", (this.m1 + this.m2 + this.m3));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String birth = sc.next();
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();
        SinhVien sv = new SinhVien(name, birth, m1, m2, m3);
        sv.output();
    }
}
