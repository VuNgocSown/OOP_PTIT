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
public class J05034 {
    public static class SV{
        private static int counter = 0;
        private int stt=generateStt();
        private String id;
        private String name;
        private String className;
        private String email;
        private String dn;

        public SV(String id, String name, String className, String email, String dn) {
            this.id = id;
            this.name = name;
            this.className = className;
            this.email = email;
            this.dn = dn;
        }
        public static int generateStt(){
            counter++;
            return counter;
        }
        public String getName() {
            return name;
        }

        public String getDn() {
            return dn;
        }
        @Override
        public String toString(){
            return stt+" "+id+" "+name+" "+className+" "+email+" "+dn;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SV[] svs = new SV[n];
        sc.nextLine();
        for(int i=0; i<n; i++){
            svs[i] = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(svs, new Comparator<SV>(){
            @Override
            public int compare(SV sv1, SV sv2){
                return sv1.getName().compareTo(sv2.getName());
            }
        });
        int q = sc.nextInt();
        while(q-- > 0){
            String dn = sc.next();
            for(SV sv:svs){
                if(sv.getDn().compareTo(dn)==0){
                    System.out.println(sv);
                }
            }
        }
    }
}
