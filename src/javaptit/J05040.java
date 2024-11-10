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
public class J05040 {
    public static class NV{
        private static int counter = 0;
        private String id;
        private String name;
        private int dailySalary;
        private int workingDay;
        private String position;

        public NV(String name, int dailySalary, int workingDay, String position) {
            this.id = generateId();
            this.name = name;
            this.dailySalary = dailySalary;
            this.workingDay = workingDay;
            this.position = position;
        }
        public static String generateId(){
            return String.format("NV%02d", ++counter);
        }
        public int monthlySalary(){
            return dailySalary*workingDay;
        }
        public int prize(){
            if(workingDay>=25){
                return (int)(monthlySalary()*0.2);
            }
            else if(workingDay>=22){
                return (int)(monthlySalary()*0.1);
            }
            else{
                return 0;
            }
        }
        public int cv(){
            if(position.compareTo("GD")==0){
                return 250000;
            }
            else if(position.compareTo("PGD")==0){
                return 200000;
            }
            else if(position.compareTo("TP")==0){
                return 180000;
            }
            else{
                return 150000;
            }
        }
        public int totalSalary(){
            return monthlySalary()+prize()+cv();
        }
        @Override
        public String toString(){
            return id+" "+name+" "+monthlySalary()+" "+prize()+" "+cv()+" "+totalSalary();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NV[] nvs = new NV[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            nvs[i] = new NV(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.next());
        }
        int totalMoney = 0;
        for(NV nv:nvs){
            System.out.println(nv);
            totalMoney+=nv.totalSalary();
        }
//        System.out.println("Tong chi phi tien luong: "+totalMoney);
    }
}
