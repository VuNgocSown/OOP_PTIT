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
public class KT10 {
    public static class Sach{
        protected String ma;
        protected String ten;
        protected String nhaXB;
        protected double gia;
        protected static int sMa = 1;

        public Sach() {
        }

        public String getTen() {
            return ten;
        }

        public String getNhaXB() {
            return nhaXB;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public void setNhaXB(String nhaXB) {
            this.nhaXB = nhaXB;
        }
        
    }
    public interface ISach{
        double getGiaBan();
    }
    public static class SachThamKhao extends Sach implements ISach{
        private boolean dungChung;

        public SachThamKhao() {
        }
        public void nhap(Scanner in){
            ten = in.nextLine();
            nhaXB = in.nextLine();
            gia = in.nextDouble();
            dungChung = in.nextBoolean();
            ma = generateMa();
            in.nextLine();
        }
        public String generateMa(){
            String newName = "";
            String[] arr = nhaXB.split("\\s+");
            for(int i=0; i<arr.length; i++){
                newName+=Character.toUpperCase(arr[i].charAt(0));
            }
            return newName+String.format("%03d", sMa++);
        }
        @Override
        public double getGiaBan() {
            double giaBan = gia;
            String newName = "";
            String[] arr = nhaXB.split("\\s+");
            for(int i=0; i<arr.length; i++){
                newName+=Character.toUpperCase(arr[i].charAt(0));
            }
            if(newName.equals("GD")){
                giaBan = giaBan*0.95;
            }
            if(dungChung){
                giaBan = giaBan*0.9;
            }
            return giaBan;
        }
        @Override
        public String toString(){
            String dc = "";
            if(dungChung){
                dc = "Dung chung sgk";
            }
            else{
                dc = "khong";
            }
            return ma+" "+ten+" "+nhaXB+" "+dc+" "+Math.round(getGiaBan());
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sach s = new SachThamKhao();
        ((SachThamKhao) s).nhap(in);
        System.out.println(s);
        ((SachThamKhao) s).nhap(in);
        System.out.println(s);
    }
}
