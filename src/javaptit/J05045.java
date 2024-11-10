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
public class J05045 {
    public static class NV{
        private static int counter = 0;
        private String id;
        private String name;
        private String position;
        private int salaryDay;
        private int workingDay;

        public NV(String name, String position, int salaryDay, int workingDay) {
            this.id = generateId();
            this.name = formatName(name);
            this.position = position;
            this.salaryDay = salaryDay;
            this.workingDay = workingDay;
        }
        public static String generateId(){
            return String.format("NV%02d", ++counter);
        }

        public String getId() {
            return id;
        }
        
        public String getPosition() {
            return position;
        }
        
        public int cv() {
            switch (position) {
                case "GD":
                    return 500;
                case "PGD":
                    return 400;
                case "TP":
                    return 300;
                case "KT":
                    return 250;
                default:
                    return 100;
            }
        }
        public static String formatName(String name) {
            String[] words = name.toLowerCase().split("\\s+");
            StringBuilder formattedName = new StringBuilder();
            for (String word : words) {
                if (word.length() > 0) {
                    formattedName.append(Character.toUpperCase(word.charAt(0)))
                                 .append(word.substring(1))
                                 .append(" ");
                }
            }
            return formattedName.toString().trim();
        }
        public int salary(){
            return salaryDay*workingDay;
        }
        public int borrow() {
            int totalIncome = cv() + salary();
            if ((float) totalIncome * 2 / 3 < 25000) {
                return Math.round(((float) totalIncome * 2 / 3) / 1000) * 1000;
            }
            return 25000;
        }
        @Override
        public String toString(){
            return id+" "+name+" "+cv()+" "+salary()+" "+borrow()+" "+(salary()-borrow()+cv());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NV[] nvs = new NV[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            nvs[i] = new NV(sc.nextLine().trim(), sc.nextLine().trim(), sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(nvs, new Comparator<NV>(){
            @Override
            public int compare(NV nv1, NV nv2){
                if(nv1.salary()!=nv2.salary()){
                    return Integer.compare(nv2.salary(),nv1.salary());
                }
                return nv1.getId().compareTo(nv2.getId());
            }
        });
        for(NV nv:nvs){
            System.out.println(nv);
        }
    }
}