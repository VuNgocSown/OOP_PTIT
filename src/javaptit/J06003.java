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
public class J06003 {
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

        public int getGroup() {
            return group;
        }
        
        @Override
        public String toString(){
            return id + " " + name + " " + phone;
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
        int q = sc.nextInt();
        for(int i=1; i<=q; i++){
            int x = sc.nextInt();
            System.out.println("DANH SACH NHOM "+i+":");
            for(SV sv:svs){
                if(sv.getGroup() == x){
                    System.out.println(sv);
                }
            }
            System.out.print("Bai tap dang ky: ");
            System.out.println(bts[x-1]);
        }
    }
}
