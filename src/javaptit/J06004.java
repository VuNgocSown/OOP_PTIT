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
public class J06004 {
    public static class SV{
        private String id;
        private String name;
        private String phone;
        private int group;

        public SV(String id, String name, String phone, int group) {
            this.id = id;
            this.name = name;
            this.phone = phone;
            this.group = group;
        }

        public String getId() {
            return id;
        }
        
        public int getGroup() {
            return group;
        }
        
        @Override
        public String toString(){
            return id + " " + name + " " + phone + " "+ group;
        }
    }
    public static class BT{
        private static int counter = 0;
        private int group;
        private String nameBT;

        public BT(String nameBT) {
            this.group = genGroup();
            this.nameBT = nameBT;
        }
        public static int genGroup(){
            return ++counter;
        }
        
        @Override
        public String toString(){
            return nameBT;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        SV[] svs = new SV[n];
        BT[] bts = new BT[m];
        for(int i=0; i<n; i++){
            sc.nextLine();
            svs[i] = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        sc.nextLine();
        for(int i=0; i<m; i++){
            bts[i] = new BT(sc.nextLine());
        }
        Arrays.sort(svs, new Comparator<SV>(){
           @Override
           public int compare(SV sv1, SV sv2){
               return sv1.getId().compareTo(sv2.getId());
           }
        });
        for(SV sv : svs){
            System.out.println(sv + " " + bts[sv.getGroup()-1]);
        }
    }
}
