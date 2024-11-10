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
public class J05023 {
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
        int q = sc.nextInt();
        while(q-- > 0){
            String className = sc.next();
            System.out.println("DANH SACH SINH VIEN KHOA "+className+":");
            for(SV sv:svs){
                if(sv.getClassName().substring(1,3).compareTo(className.substring(2))==0){
                    System.out.println(sv);
                }
            }
        }
    }
}
