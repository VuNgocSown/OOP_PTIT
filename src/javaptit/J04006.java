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
public class J04006 {
    public static class SinhVien{
        private String id = "B20DCCN001";
        private String name;
        private String className;
        private String birth;
        private double gpa;
        public SinhVien(String name, String className, String birth, double gpa){
            this.name = name;
            this.className = className;
            this.birth = birth;
            this.gpa = gpa;
        }
        public SinhVien(){
            this.name = "";
            this.birth = "";
            this.className = "";
            this.gpa = 0;
        }
        public void newBirth(){
            if(this.birth.charAt(2)!='/'){
                this.birth = '0'+this.birth;
            }
            if(this.birth.charAt(5)!='/'){
                this.birth = this.birth.substring(0, 3) + '0' + this.birth.substring(3);
            }
        }
        public void output(){
            System.out.print(this.id + " " + this.name + " " + this.className + " " + this.birth + " ");
            System.out.printf("%.2f", this.gpa);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String className = sc.next();
        String birth = sc.next();
        double gpa = sc.nextDouble();
        SinhVien sv = new SinhVien(name, className, birth, gpa);
        sv.newBirth();
        sv.output();
    }
}
