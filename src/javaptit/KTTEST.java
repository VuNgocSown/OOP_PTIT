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
public class KTTEST{
    public static class MH{
        private static int counter = 0;
        private String id;
        private String name;
        private String phone;
        private String day;
        private int totalPrice;

        public MH(String name,String phone, String day, int totalPrice) {
            this.id = generateId(name);
            this.name = name;
            this.phone = phone;
            this.day = day;
            this.totalPrice = totalPrice;
        }
        public static String generateId(String name){
            String newName = "";
            String[] arr = name.split("\\s+");
            for(int i=0; i<arr.length; i++){
                newName+=Character.toUpperCase(arr[i].charAt(0));
            }
            return newName+String.format("%03d", counter++);
        }

        public String getDay() {
            return day;
        }
        
        @Override
        public String toString(){
            return id+" "+name+" "+day+" "+totalPrice;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MH[] mhs = new MH[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            String phone = sc.next();
            String day = sc.next();
            int m = sc.nextInt();
            int totalPrice = 0;
            for(int j=0; j<m; j++){
                sc.nextLine();
                String vp = sc.nextLine();
                int quantity = sc.nextInt();
                int price = sc.nextInt();
                totalPrice += quantity*price;
            }
            mhs[i] = new MH(name, phone, day, totalPrice);
        }
        Arrays.sort(mhs, new Comparator<MH>(){
            @Override
            public int compare(MH mh1, MH mh2){
                String[] arr1 = mh1.getDay().split("/");
                String[] arr2 = mh2.getDay().split("/");
                if(arr1[2].compareTo(arr2[2])!=0){
                    if(arr1[1].compareTo(arr2[1])!=0){
                        if(arr1[0].compareTo(arr2[0])!=0){
                            return arr2[0].compareTo(arr1[0]);
                        }
                        return arr2[1].compareTo(arr1[1]);
                    }
                    return arr2[2].compareTo(arr1[2]);
                }
                return 0;
            }
        });
        for(MH mh:mhs){
            System.out.println(mh);
        }
    }
}
