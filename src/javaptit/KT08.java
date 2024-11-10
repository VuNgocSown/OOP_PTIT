package javaptit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class KT08 {
    public static class TuyenXeBuyt {
        private String ma;
        private String hoTenTaiXe;
        private Date ngayDi;
        private int soHieuTuyen;
        private int soLuotDiDuoc;
        private String kieuNgay;
        private double doanhThu;

        private static int sMa = 1;

        public TuyenXeBuyt(String hoTenTaiXe, String ngayDi, int soHieuTuyen, int soLuotDiDuoc, String kieuNgay) throws ParseException {
            this.ma = generateMa(soHieuTuyen);
            this.hoTenTaiXe = hoTenTaiXe;
            this.ngayDi = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDi);
            this.soHieuTuyen = soHieuTuyen;
            this.soLuotDiDuoc = soLuotDiDuoc;
            this.kieuNgay = kieuNgay;
            this.doanhThu = tinhDoanhThu();
        }

        private String generateMa(int soHieuTuyen) {
            return "HN" + soHieuTuyen + String.format("%02d", sMa++);
        }

        public int getThang() {
            Calendar cal = Calendar.getInstance();
            cal.setTime(ngayDi);
            return cal.get(Calendar.MONTH) + 1; // Calendar.MONTH is zero-based
        }
        
        public int getNam() {
            Calendar cal = Calendar.getInstance();
            cal.setTime(ngayDi);
            return cal.get(Calendar.YEAR);
        }

        public int getNgay() {
            Calendar cal = Calendar.getInstance();
            cal.setTime(ngayDi);
            return cal.get(Calendar.DAY_OF_MONTH);
        }

        public int getSoHieuTuyen() {
            return soHieuTuyen;
        }

        public void setHoTenTaiXe(String hoTenTaiXe) {
            this.hoTenTaiXe = hoTenTaiXe;
        }

        public void setSoLuotDiDuoc(int soLuotDiDuoc) {
            this.soLuotDiDuoc = soLuotDiDuoc;
        }

        public void setKieuNgay(String kieuNgay) {
            this.kieuNgay = kieuNgay;
        }

        public String getMa() {
            return ma;
        }
        
        private double tinhDoanhThu() {
            double baseDoanhThu;
            if (soLuotDiDuoc < 5) {
                baseDoanhThu = soLuotDiDuoc * 800;
            } else if (soLuotDiDuoc <= 10) {
                baseDoanhThu = soLuotDiDuoc * 780;
            } else {
                baseDoanhThu = soLuotDiDuoc * 750;
            }

            if (kieuNgay.equals("nghi")) {
                baseDoanhThu *= 1.1;
            } else if (kieuNgay.equals("le")) {
                baseDoanhThu *= 1.2;
            }

            return baseDoanhThu;
        }

        @Override
        public String toString() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            return ma + " " + hoTenTaiXe + " " + dateFormat.format(ngayDi) + " " + soHieuTuyen + " " + soLuotDiDuoc + " " + kieuNgay + " " + Math.round(tinhDoanhThu());
        }
    }

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        TuyenXeBuyt[] tuyenXeBuyts = new TuyenXeBuyt[n];

        for (int i = 0; i < n; i++) {
            String hoTenTaiXe = in.nextLine();
            String ngayDi = in.nextLine();
            int soHieuTuyen = Integer.parseInt(in.nextLine());
            int soLuotDiDuoc = Integer.parseInt(in.nextLine());
            String kieuNgay = in.nextLine();

            tuyenXeBuyts[i] = new TuyenXeBuyt(hoTenTaiXe, ngayDi, soHieuTuyen, soLuotDiDuoc, kieuNgay);
        }
        String ma = in.next();
        boolean check = false;
        for (TuyenXeBuyt tuyenXeBuyt : tuyenXeBuyts) {
            if(ma.equals(tuyenXeBuyt.getMa())){
                check = true;
                System.out.println(tuyenXeBuyt);
                in.nextLine();
                String ten = in.nextLine();
                int luotDi = in.nextInt();
                String kieuNgay = in.next();
                tuyenXeBuyt.setHoTenTaiXe(ten);
                tuyenXeBuyt.setSoLuotDiDuoc(luotDi);
                tuyenXeBuyt.setKieuNgay(kieuNgay);
                System.out.println(tuyenXeBuyt);
            }
        }
        if(!check){
            System.out.println("khong tim thay");
        }
    }
}