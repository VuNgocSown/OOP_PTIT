/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author 84971
 */
public class KT04 {
    public static class PTGT{
        protected String ma;
        protected String hang;
        protected Date ngayLanBanh;
        protected double giaBan;
        protected static int sMa = 1;
        public PTGT(String hang, Date ngayLanBanh, double giaBan){
            this.hang = hang;
            this.ngayLanBanh = ngayLanBanh;
            this.giaBan = giaBan;
        }
        public double getGiaBan(){
            return giaBan;
        }       
        public int getNamLanBanh(){
            Calendar cal = Calendar.getInstance();
            cal.setTime(ngayLanBanh);
            return cal.get(Calendar.YEAR);
        }
    }
    public static class QLPT extends PTGT{
        private ArrayList<PTGT> a;

        public QLPT() {
            super("", new Date(), 0.0);
            a = new ArrayList<>();
        }
        public String generateMa(){
            return hang.substring(0,1).toUpperCase()+String.format("%03d", sMa++);
        }
        public void nhap(Scanner in){
            this.hang = in.next();
            this.ma = generateMa();
            try{
                this.ngayLanBanh = new SimpleDateFormat("DD/mm/yyyy").parse(in.next());
            }
            catch(ParseException e){
                
            }
            this.giaBan = in.nextDouble();
            a.add(new PTGT(this.hang, this.ngayLanBanh, this.giaBan));
        }
        
        public void tongTienTheoNam(){
            TreeMap<Integer, Double> map = new TreeMap<>();
            for(PTGT pt:a){
                int nam = pt.getNamLanBanh();
                double giaBan = pt.getGiaBan();
                map.put(nam, map.getOrDefault(nam, 0.0)+giaBan);
            }
            for(Map.Entry<Integer, Double> entry:map.entrySet()){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QLPT q = new QLPT();
        for(int i=0; i<4; i++){
            q.nhap(in);
        }
        q.tongTienTheoNam();
    }
}
