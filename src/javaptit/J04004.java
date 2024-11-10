package javaptit;

import java.util.Scanner;

public class J04004 {
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static class PhanSo {
        private long tu;
        private long mau;

        public PhanSo(long tu, long mau) {
            this.tu = tu;
            this.mau = mau;
        }

        public void rutGon() {
            long ucln = gcd(this.tu, this.mau);
            this.tu /= ucln;
            this.mau /= ucln;
        }

        public static PhanSo cong(PhanSo a, PhanSo b) {
            // Tính ước chung lớn nhất của mẫu số của hai phân số
            long ucln = gcd(a.mau, b.mau);

            // Tính mẫu số chung
            long mauChung = (a.mau / ucln) * b.mau;

            // Tính tử số mới
            long tuMoi = a.tu * (mauChung / a.mau) + b.tu * (mauChung / b.mau);

            // Tạo phân số mới
            PhanSo c = new PhanSo(tuMoi, mauChung);

            // Rút gọn phân số mới
            c.rutGon();

            return c;
        }

        public void output() {
            System.out.println(this.tu + "/" + this.mau);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextLong();
        long y1 = sc.nextLong();
        long x2 = sc.nextLong();
        long y2 = sc.nextLong();
        PhanSo p1 = new PhanSo(x1, y1);
        p1.rutGon();
        PhanSo p2 = new PhanSo(x2, y2);
        p2.rutGon();
        PhanSo c = PhanSo.cong(p1, p2);
        c.output();
    }
}