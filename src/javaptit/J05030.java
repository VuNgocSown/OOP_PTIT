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
public class J05030 {
    public static class SV{
        private String id;
        private String name;
        private String className;
        private double m1;
        private double m2;
        private double m3;

        public SV(String id, String name, String className, double m1, double m2, double m3) {
            this.id = id;
            this.name = name;
            this.className = className;
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        }

        public String getId() {
            return id;
        }
        @Override
        public String toString(){
            return id+" "+name+" "+className+" "+String.format("%.1f %.1f %.1f", m1, m2, m3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SV[] svs = new SV[n];
//        sc.nextLine();
        for(int i=0; i<n; i++){
            sc.nextLine();
            svs[i] = new SV(sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(svs, new Comparator<SV>(){
            @Override
            public int compare(SV sv1, SV sv2){
                if(sv1.getId().compareTo(sv2.getId())!=0){
                    return sv1.getId().compareTo(sv2.getId());
                }
                return 0;
            }
        });
        int cnt = 0;
        for(SV sv:svs){
            cnt++;
            System.out.println(cnt+" "+sv);
        }
    }
}
