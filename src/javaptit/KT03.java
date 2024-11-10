package javaptit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class KT03 {
    public static class PTGT {
        protected String ma;
        protected String hang;
        protected Date ngayLanBanh;
        protected double giaGoc;
        protected static int sMa = 1;

        public String getHang() {
            return this.hang;
        }

        public void setHang(String hang) {
            this.hang = hang;
        }

        public void setNgayLanBanh(Date ngayLanBanh) {
            this.ngayLanBanh = ngayLanBanh;
        }

        public int getNamLanBanh() {
            Calendar cal = Calendar.getInstance();
            cal.setTime(this.ngayLanBanh);
            return cal.get(Calendar.YEAR);
        }
    }

    public interface IPTGT {
        public double getGiaBan();
    }

    public static class XeTai extends PTGT implements IPTGT {
        private double trongTai;
        private boolean thung;

        public XeTai() {
        }

        public String generateMa() {
            return hang.substring(0, 1).toUpperCase() + String.format("%03d", sMa++);
        }

        public void nhap(Scanner in) {
            this.hang = in.next();
            this.ma = generateMa();
            this.trongTai = in.nextDouble();
            this.thung = in.nextBoolean();
            try {
                this.ngayLanBanh = new SimpleDateFormat("MM/dd/yyyy").parse(in.next());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.giaGoc = in.nextDouble();
            this.ma = generateMa();
        }

        @Override
        public double getGiaBan() {
            double price;
            if (getNamLanBanh() >= 2020) {
                price = this.giaGoc + 0.1 * this.giaGoc;
            } else {
                price = this.giaGoc * 0.8;
            }
            if (this.thung) {
                price += 500;
            }
            return Math.round(price);
        }

        @Override
        public String toString() {
            return ma + " " + hang + " " + getNamLanBanh() + " " + trongTai + " " + getGiaBan();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PTGT pt = new XeTai();
        ((XeTai) pt).nhap(sc);
        PTGT pt2 = new XeTai();
        ((XeTai) pt2).nhap(sc);

        System.out.println(pt);
        System.out.println(pt2);

        sc.close();
    }
}
