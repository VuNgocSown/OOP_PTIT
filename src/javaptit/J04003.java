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
public class J04003 {
    public static long gcd(long a, long b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
    public static class PhanSo{
        private long tu;
        private long mau;
        public PhanSo(long tu, long mau){
            this.tu = tu;
            this.mau = mau;
        }
        public void rutGon(){
            long ucln = gcd(this.tu, this.mau);
            this.tu /= ucln;
            this.mau /= ucln;
        }
        public void output(){
            System.out.println(this.tu + "/" + this.mau);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();
        PhanSo p = new PhanSo(tu, mau);
        p.rutGon();
        p.output();
    }
}