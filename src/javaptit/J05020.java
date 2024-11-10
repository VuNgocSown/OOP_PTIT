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
public class J05020 {
    public static class SV{
        private String id;
        private String name;
        private String className;
        private String email;

        public SV(String id, String name, String className, String email) {
            this.id = id;
            this.name = name;
            this.className = className;
            this.email = email;
        }

        public String getId() {
            return id;
        }

        public String getClassName() {
            return className;
        }
        @Override
        public String toString(){
            return id + " " + name + " " + className + " " + email;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SV[] svs = new SV[n];
        sc.nextLine();
        for(int i=0; i<n; i++){
            svs[i] = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(svs, new Comparator<SV>(){
            @Override
            public int compare(SV sv1, SV sv2){
                return sv1.getId().compareTo(sv2.getId());
            }
        });
        for(SV sv:svs){
            System.out.println(sv);
        }
    }
}
