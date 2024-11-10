/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 84971
 */
public class J05005 {
    public static class SV{
        private static int counter = 0;
        private String id;
        private String name;
        private String birth;
        private String className;
        private double gpa;
        public SV(String name, String className, String birth, double gpa){
            if(birth.charAt(2)!='/'){
                birth = "0" + birth;
            }
            if(birth.charAt(5)!='/'){
                birth=birth.substring(0, 3) + "0" + birth.substring(3);
            }
            this.name = name;
            this.className=className;
            this.birth=birth;
            this.gpa=gpa;
            this.id=generateId();
            
        }
        public static String generateId(){
            counter++;
            return String.format("B20DCCN%03d", counter);
        }
        public String getName() {
            StringTokenizer st = new StringTokenizer(this.name," ");
            StringBuilder sb = new StringBuilder();
            while(st.hasMoreTokens()){
                String tok = st.nextToken();
                tok = tok.substring(0,1).toUpperCase() + tok.substring(1).toLowerCase();
                sb.append(tok);
                sb.append(" ");

            }
            sb.delete(sb.length()-1,sb.length());
            return String.valueOf(sb);
        } 
        public double getGpa(){
            return this.gpa;
        }
        @Override
        public String toString(){
            return this.id+" "+this.getName()+" "+this.className+" "+this.birth+" "+String.format("%.2f", this.gpa);
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
            svs[i]=new SV(name, className, birth, gpa);
        }
        Arrays.sort(svs, new Comparator<SV>() {
            @Override
            public int compare(SV sv1, SV sv2) {
                return Double.compare(sv2.getGpa(), sv1.getGpa());
            }
        });
        for(SV sv:svs){
            System.out.println(sv);
        }
    }
}
