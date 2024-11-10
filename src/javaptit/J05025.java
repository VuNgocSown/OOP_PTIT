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
public class J05025 {
    public static class GV{
        private static int counter = 0;
        private String id;
        private String name;
        private String subject;
        public GV(String name, String subject){
            this.id = generateId();
            this.name = name;
            this.subject = subject;
        }
        public static String generateId(){
            counter++;
            return String.format("GV%02d", counter);
        }
        public String getName(){
            String[] arr = this.name.split("\\s+");
            return arr[arr.length-1];
        }
        public String getId(){
            return this.id;
        }
        @Override
        public String toString(){
            return id+" "+name+" "+subject;
        }
    }
    public static String handle(String s){
        String[] arr = s.split("\\s+");
        String newSubject = "";
        for(String x:arr){
            newSubject+=Character.toUpperCase(x.charAt(0));
        }
        return newSubject;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GV[] gvs = new GV[n];
        sc.nextLine();
        for(int i=0; i<n; i++){
            gvs[i] = new GV(sc.nextLine(), handle(sc.nextLine()));
        }
        Arrays.sort(gvs, new Comparator<GV>(){
            @Override
            public int compare(GV gv1, GV gv2){
                if(gv1.getName().compareTo(gv2.getName())!=0){
                    return gv1.getName().compareTo(gv2.getName());
                }
                return gv1.getId().compareTo(gv2.getId());
            }
        });
        for(GV gv:gvs){
            System.out.println(gv);
        }
        
    }
}
