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
//dung lop ma tran
/*

*/
public class J05010 {
    public static class MH{
        public static int counter = 0;
        private int id;
        private String name;
        private String category;
        private double impo;
        private double expo;
        public static int generateId(){
            counter++;
            return counter;
        }
        public MH(String name, String category, double impo, double expo){
            this.id =generateId();
            this.name = name;
            this.category = category;
            this.impo = impo;
            this.expo = expo;
        }
        public double getImpo(){
            return this.impo;
        }
        public double getExpo(){
            return this.expo;
        }
        @Override
        public String toString(){
            return this.id+" "+this.name+" "+this.category+" "+String.format("%.2f", expo-impo);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MH[] mhs = new MH[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            mhs[i]=new MH(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(mhs, new Comparator<MH>(){
            @Override
            public int compare(MH mh1, MH mh2) {
                double diff1 = mh1.getExpo() - mh1.getImpo();
                double diff2 = mh2.getExpo() - mh2.getImpo();
                if (diff1 != diff2) {
                    return Double.compare(diff2, diff1);
                }
                return 0;
            }
        });
        for(MH mh:mhs){
            System.out.println(mh);
        }
    }
}
