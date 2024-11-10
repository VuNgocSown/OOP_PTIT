package javaptit;

import java.util.Scanner;

public class KT07 {
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
    public static class SachGiaoKhoa extends Sach implements ISach{
        private int lop;

        public SachGiaoKhoa() {
        }
        public void nhap(Scanner in){
            this.ten = in.nextLine();
            this.nhaXB = in.nextLine();
            this.ma = generateMa();
            this.gia = in.nextDouble();
            this.lop = in.nextInt();
            in.nextLine();
        }
        public String generateMa(){
            String newName = "";
            String[] arr = nhaXB.split("\\s+");
            for(int i=0; i<arr.length; i++){
                newName += Character.toUpperCase(arr[i].charAt(0));
            }
            return newName + String.format("%03d", sMa++);
        }
        @Override
        public double getGiaBan() {
            if(this.lop <= 5){
                return gia*0.8;
            }
            else if(this.lop<=9){
                return gia*0.9;
            }
            else{
                return gia;
            }
        }
        @Override
        public String toString(){
            return ma + " " + ten + " "+ nhaXB + " " + lop + " " + Math.round(getGiaBan());
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sach s = new SachGiaoKhoa();
        ((SachGiaoKhoa) s).nhap(in);
        System.out.println(s);
        ((SachGiaoKhoa) s).nhap(in);
        System.out.println(s);
    }
}
