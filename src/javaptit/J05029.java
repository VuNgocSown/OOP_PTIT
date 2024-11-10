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
public class J05029 {
    public static class DN{
        private String id;
        private String name;
        private int num;

        public DN(String id, String name, int num) {
            this.id = id;
            this.name = name;
            this.num = num;
        }

        public String getId() {
            return id;
        }

        public int getNum() {
            return num;
        }
        @Override
        public String toString(){
            return id+" "+name+" "+num;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        sc.nextLine();
        DN[] dns = new DN[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            dns[i] = new DN(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        Arrays.sort(dns, new Comparator<DN>(){
            @Override
            public int compare(DN dn1, DN dn2){
                if(dn1.getNum()!=dn2.getNum()){
                    return dn2.getNum()-dn1.getNum();
                }
                return dn1.getId().compareTo(dn2.getId());
            }
        });
        int q = sc.nextInt();
        while(q-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for(DN dn:dns){
                if(dn.getNum()>=a && dn.getNum()<=b){
                    System.out.println(dn);
                }
            }
        }
    }
}
