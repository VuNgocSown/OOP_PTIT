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
public class J05004 {
    public static class SV{
        private static int counter=0;
        private String id;
        private String name;
        private String birth;
        private String className;
        private double gpa;
        public static String generateId(){
            counter++;
            return String.format("B20DCCN%03d", counter);
        }
        public SV(){
            this.id="";
            this.name="";
            this.birth="";
            this.className="";
            this.gpa=0;
        }
        public SV(String name, String className, String birth, double gpa){
            String[] arr=name.split("\\s+");
            name = "";
            for(int i=0; i<arr.length; i++){
                name+=Character.toUpperCase(arr[i].charAt(0))+(arr[i].substring(1).toLowerCase()+ ' ');
            }
            name = name.trim();
            if(birth.charAt(2)!='/'){
                birth='0'+birth;
            }
            if(birth.charAt(5)!='/'){
                birth = birth.substring(0, 3) + "0" + birth.substring(3);
            }
            this.id = generateId();
            this.name=name;
            this.className=className;
            this.birth=birth;
            this.gpa=gpa;
        }
        @Override
        public String toString(){
            return this.id+" "+this.name+" "+this.className+" "+this.birth+" "+String.format("%.2f", this.gpa);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SV[] svs = new SV[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            String className = sc.nextLine();
            String birth = sc.nextLine();
            double gpa = sc.nextDouble();
            svs[i] = new SV(name, className, birth, gpa);
        }
        for(SV sv:svs){
            System.out.println(sv);
        }
    }
}