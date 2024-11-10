///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package javaptit;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.Scanner;
//
///**
// *
// * @author 84971
// */
//public class J05021 {
//    public static class SV{
//        private String id;
//        private String name;
//        private String className;
//        private String email;
//
//        public SV(String id, String name, String className, String email) {
//            this.id = id;
//            this.name = name;
//            this.className = className;
//            this.email = email;
//        }
//
//        public String getId() {
//            return id;
//        }
//
//        public String getClassName() {
//            return className;
//        }
//        @Override
//        public String toString(){
//            return id + " " + name + " " + className + " " + email;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        SV[] svs = new SV[1005];
//        int cnt = 0;
//        while(sc.hasNextLine()){
//            if(sc.nextLine().isEmpty())
//            svs[cnt]=new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//            cnt++;
//        }
//        Arrays.sort(svs, new Comparator<SV>(){
//            @Override
//            public int compare(SV sv1, SV sv2){
//                return sv1.getId().compareTo(sv2.getId());
//            }
//        });
//        for(int i=0; i<cnt; i++){
//            System.out.println(svs[i]);
//        }
//    }
//}
