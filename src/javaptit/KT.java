import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KT {
    public abstract static class DichVu {
        protected String ma;
        protected String ten;
        protected String soDienThoai;
    
        public DichVu() {
        }
    
        public DichVu(String ma, String ten, String soDienThoai) {
            this.ma = ma;
            this.ten = ten;
            this.soDienThoai = soDienThoai;
        }
    
        public void setMa(String ma) {
            this.ma = ma;
        }
    
        public void setTen(String ten) {
            this.ten = ten;
        }
    
        public void setSoDienThoai(String soDienThoai) {
            this.soDienThoai = soDienThoai;
        }
    
        public String getMa() {
            return ma;
        }
    
        public String getTen() {
            return ten;
        }
    
        public String getSoDienThoai() {
            return soDienThoai;
        }
    }
    
    public interface IDichVu {
        boolean isMa(String ma);
        boolean isDienThoai(String soDienThoai);
        double getTienNop();
    }
    
    public static class DVDien extends DichVu implements IDichVu {
        private int thang;
        private int soKW;
    
        public DVDien() {
        }
    
        public DVDien(String ma, String ten, String soDienThoai, int soKW, int thang) {
            super(ma, ten, soDienThoai);
            this.soKW = soKW;
            this.thang = thang;
        }
    
        public void setThang(int thang) {
            this.thang = thang;
        }
    
        public void setSoKW(int soKW) {
            this.soKW = soKW;
        }
    
        public int getThang() {
            return thang;
        }
    
        public int getSoKW() {
            return soKW;
        }
        public void input(Scanner in){
            String code = null;
            while(true){
                code = in.next();
                if(isMa(code)){
                    this.ma = code;
                    break;
                }
                else{
                    System.out.println("nhap sai");
                }
            }
            in.nextLine();
            this.ten = in.nextLine();
            this.thang = in.nextInt();
            String phone = null;
            while(true){
                phone = in.next();
                if(isDienThoai(phone)){
                    this.soDienThoai = phone;
                    break;
                }
                else{
                    System.out.println("nhap sai");
                }
            }
            this.soKW = in.nextInt();
            
            
        }
        @Override
        public double getTienNop() {
            if(soKW <= 50){
                return soKW*1000;
            }
            else if(soKW <= 100){
                return soKW*2000;
            }
            else if(soKW <= 200){
                return soKW*3000;
            }
            else{
                return soKW*4000;
            }
        }
        @Override
        public boolean isMa(String ma) {
            return ma.matches("^(hn|da)\\d{2}t\\d{2}$");
        }
    
        @Override
        public boolean isDienThoai(String soDienThoai) {
            return soDienThoai.matches("^0\\d{9}$");
        }
        @Override
        public String toString() {
            return getMa() + " " + getTen() + " " + getSoDienThoai() + " " + soKW + " " + String.format("%.1f", getTienNop());
        }
    }
    public static boolean isMa(String ma) {
        return ma.matches("^(hn|da)\\d{2}t\\d{2}$");
    }
    public static boolean isDienThoai(String soDienThoai) {
        return soDienThoai.matches("^0\\d{9}$");
    }
    public static void main(String[] args) {
        DVDien a = new DVDien();
        Scanner in = new Scanner(System.in);
        a.input(in);
        System.out.println(a);
//        Scanner sc = new Scanner(System.in);
//        String ma = null;c cx cx c  
//        while(true){
//            ma = sc.next();
//            if(isMa(ma)){
//                break;
//            }
//            else{
//                System.out.println("nhap sai");
//            }
//        }
//        sc.nextLine();
//        String name = sc.nextLine();
//        int thang = sc.nextInt();
//        String phone = null;
//        while(true){
//            phone = sc.next();
//            if(isDienThoai(phone)){
//                break;
//            }
//            else{
//                System.out.println("nhap sai");
//            }
//        }
//        int kw = sc.nextInt();
//        DVDien dv = new DVDien(ma, name, phone, kw, thang);
//        System.out.println(dv);
    }
    Optional<Document> max =
    list.stream().collect(Collectors.maxBy(
    Comparator.comparing(Document::getNum)));
}