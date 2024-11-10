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
public class KT12 {
    public static class Xuong{
        protected String ma;
        protected String diachi;
        protected int dientich;

        public Xuong() {
        }

        public Xuong(String ma, String dichi, int dientich) {
            this.ma = ma;
            this.diachi = dichi;
            this.dientich = dientich;
        }

        public String getMa() {
            return ma;
        }

        public String getDichi() {
            return diachi;
        }

        public int getDientich() {
            return dientich;
        }

        public void setMa(String ma) {
            this.ma = ma;
        }

        public void setDichi(String dichi) {
            this.diachi = dichi;
        }

        public void setDientich(int dientich) {
            this.dientich = dientich;
        }
        
    }
    public interface IXuong{
        boolean isMa(String ma);
        boolean isThoigian(String thoigian);
        double getTongTien();
    }
    public static class XuongGo extends Xuong implements IXuong{
        private String thoigian;
        private double giaThang;

        public XuongGo() {
        }
        
        public XuongGo(String ma, String dichi, int dientich, String thoigian, double giaThang) {
            super(ma, dichi, dientich);
            this.thoigian = thoigian;
            this.giaThang = giaThang;
        }

        public String getThoigian() {
            return thoigian;
        }

        public double getGiaThang() {
            return giaThang;
        }

        public void setThoigian(String thoigian) {
            this.thoigian = thoigian;
        }

        public void setGiaThang(double giaThang) {
            this.giaThang = giaThang;
        }
        public void input(Scanner in){
            String ma = null;
            while(true){
                ma = in.next();
                if(isMa(ma)){
                    this.ma = ma;
                    break;
                }
                else{
                    System.out.println("nhap sai");
                }
            }
            in.nextLine();
            this.diachi = in.nextLine();
            String thoigian = null;
            this.dientich = in.nextInt();
            in.nextLine();
            while(true){
                thoigian = in.nextLine();
                if(isThoigian(thoigian)){
                    this.thoigian = thoigian;
                    break;
                }
                else{
                    System.out.println("nhap sai");
                }
            }
            this.giaThang = in.nextDouble();
            
        }
        @Override
        public boolean isMa(String ma) {
            return ma.matches("^[xg]\\d{2}hn\\d{2}$");
        }
        @Override
        public double getTongTien() {
            String[] arr = thoigian.split("-");
            int year1 = Integer.parseInt(arr[0]);
            int year2 = Integer.parseInt(arr[1]);
            return (year2-year1)*12*giaThang;
        }

        @Override
        public boolean isThoigian(String thoigian) {
            if (!thoigian.matches("^(\\d{4})-(\\d{4})$")) {
                return false;
            }
            String[] arr = thoigian.split("-");
            int year1 = Integer.parseInt(arr[0]);
            int year2 = Integer.parseInt(arr[1]);
            return year1 < year2;
        }
        @Override
        public String toString(){
            return ma.toUpperCase()+" "+diachi+" "+dientich+" "+thoigian+" "+getTongTien();
        }
    }
    public static void main(String[] args) {
        XuongGo a=new XuongGo();
        Scanner in=new Scanner(System.in);
        a.input(in);
        System.out.println(a);
    }
}
