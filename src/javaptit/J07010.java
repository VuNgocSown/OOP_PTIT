/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class J07010 {
    public static class SV{
        public static int counter = 0;
        private String id;
        private String name;
        private String className;
        private String birth;
        private double gpa;

        public SV(String name, String className, String birth, double gpa) {
            this.id = generateId();
            this.name = name;
            this.className = className;
            this.birth = changeBirth(birth);
            this.gpa = gpa;
        }
        public String changeBirth(String s){
            if(s.charAt(2)!='/'){
                s = "0" + s;
            }
            if(s.charAt(5)!='/'){
                s = s.substring(0, 3) + "0" + s.substring(3);
            }
            return s;
        }
        public String generateId(){
            return String.format("B20DCCN%03d", ++counter);
        }
        @Override
        public String toString(){
            return id+" "+name+" "+className+" "+birth+" "+String.format("%.2f", gpa);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("SV.in");
        Scanner sc = new Scanner(file);
        int n = sc.nextInt();
        SV[] svs = new SV[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            svs[i] = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        }
        for(SV sv:svs){
            System.out.println(sv);
        }
    }
}
