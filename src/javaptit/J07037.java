/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class J07037 {
    public static class DN{
        private String id;
        private String name;
        private int sl;

        public DN(String id, String name, int sl) {
            this.id = id;
            this.name = name;
            this.sl = sl;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getSl() {
            return sl;
        }
        @Override
        public String toString(){
            return id+" "+name+" "+sl;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = sc.nextInt();
        DN[] dns = new DN[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            dns[i] = new DN(sc.nextLine(), sc.nextLine(),sc.nextInt());
        }
        Arrays.sort(dns, new Comparator<DN>(){
            @Override
            public int compare(DN o1, DN o2) {
                return o1.getId().compareTo(o2.getId());
            }
            
        });
        for(DN dn:dns){
            System.out.println(dn);
        }
    }
}
