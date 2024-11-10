// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
// import java.time.temporal.ChronoUnit;

// interface IPTGT {
//     double getGiaBan();
// }

// class PTGT {
//     private String ma;
//     private String hang;
//     private String ngayLanBanh;
//     private double giaGoc;

//     public PTGT() {}

//     public PTGT(String ma, String hang, String ngayLanBanh, double giaGoc) {
//         this.ma = ma;
//         this.hang = hang;
//         this.ngayLanBanh = ngayLanBanh;
//         this.giaGoc = giaGoc;
//     }

//     public String getMa() {
//         return ma;
//     }

//     public void setMa(String ma) {
//         this.ma = ma;
//     }

//     public String getHang() {
//         return hang;
//     }

//     public void setHang(String hang) {
//         this.hang = hang;
//     }

//     public String getNgayLanBanh() {
//         return ngayLanBanh;
//     }

//     public void setNgayLanBanh(String ngayLanBanh) {
//         this.ngayLanBanh = ngayLanBanh;
//     }

//     public double getGiaGoc() {
//         return giaGoc;
//     }

//     public void setGiaGoc(double giaGoc) {
//         this.giaGoc = giaGoc;
//     }
// }

// class Oto extends PTGT implements IPTGT {
//     private int soCho;
//     private double dongCo;
//     private static int otoCounter = 1;

//     public Oto() {}

//     public Oto(String hang, String ngayLanBanh, double giaGoc, int soCho, double dongCo) {
//         super("", hang, ngayLanBanh, giaGoc);
//         this.soCho = soCho;
//         this.dongCo = dongCo;
//     }

//     public int getSoCho() {
//         return soCho;
//     }

//     public void setSoCho(int soCho) {
//         this.soCho = soCho;
//     }

//     public double getDongCo() {
//         return dongCo;
//     }

//     public void setDongCo(double dongCo) {
//         this.dongCo = dongCo;
//     }

//     public void setMa() {
//         String ma = getHang().substring(0, 2).toUpperCase() + "-" + String.format("%03d", otoCounter++);
//         super.setMa(ma);
//     }

//     @Override
//     public double getGiaBan() {
//         LocalDate now = LocalDate.now();
//         LocalDate ngayLanBanhDate = LocalDate.parse(getNgayLanBanh(), DateTimeFormatter.ofPattern("MM/yyyy"));
//         long years = ChronoUnit.YEARS.between(ngayLanBanhDate, now);
//         double giaBan = getGiaGoc();

//         if (years == 0) {
//             giaBan += giaBan * 0.1;
//         } else if (years <= 2) {
//             giaBan -= giaBan * 0.1;
//         } else if (years <= 5) {
//             giaBan -= giaBan * 0.2;
//         } else {
//             giaBan -= giaBan * 0.3;
//         }

//         return giaBan;
//     }

//     @Override
//     public String toString() {
//         return "Oto{" +
//                 "ma='" + getMa() + '\'' +
//                 ", hang='" + getHang() + '\'' +
//                 ", ngayLanBanh='" + getNgayLanBanh() + '\'' +
//                 ", soCho=" + soCho +
//                 ", giaBan=" + getGiaBan() +
//                 '}';
//     }
// }

// class XeTai extends PTGT implements IPTGT {
//     private double trongTai;
//     private boolean thung;
//     private static int xeTaiCounter = 1;

//     public XeTai() {}

//     public XeTai(String hang, String ngayLanBanh, double giaGoc, double trongTai, boolean thung) {
//         super("", hang, ngayLanBanh, giaGoc);
//         this.trongTai = trongTai;
//         this.thung = thung;
//     }

//     public double getTrongTai() {
//         return trongTai;
//     }

//     public void setTrongTai(double trongTai) {
//         this.trongTai = trongTai;
//     }

//     public boolean isThung() {
//         return thung;
//     }

//     public void setThung(boolean thung) {
//         this.thung = thung;
//     }

//     public void setMa() {
//         String ma = "T-" + String.format("%03d", xeTaiCounter++);
//         super.setMa(ma);
//     }

//     @Override
//     public double getGiaBan() {
//         LocalDate now = LocalDate.now();
//         LocalDate ngayLanBanhDate = LocalDate.parse(getNgayLanBanh(), DateTimeFormatter.ofPattern("MM/yyyy"));
//         long years = ChronoUnit.YEARS.between(ngayLanBanhDate, now);
//         double giaBan = getGiaGoc();

//         if (years == 0) {
//             giaBan += giaBan * 0.1;
//         } else if (years < 3) {
//             giaBan -= giaBan * 0.1;
//         } else {
//             giaBan -= giaBan * 0.2;
//         }

//         if (thung) {
//             giaBan += giaBan * 0.1;
//         }

//         return giaBan;
//     }

//     @Override
//     public String toString() {
//         return "XeTai{" +
//                 "ma='" + getMa() + '\'' +
//                 ", hang='" + getHang() + '\'' +
//                 ", ngayLanBanh='" + getNgayLanBanh() + '\'' +
//                 ", trongTai=" + trongTai +
//                 ", giaBan=" + getGiaBan() +
//                 '}';
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Oto o = new Oto("Yaris", "02/2023", 32000, 4, 1.5);
//         o.setMa();
//         System.out.println(o);

//         XeTai t = new XeTai("Ranger", "10/2018", 16000, 3.5, true);
//         t.setMa();
//         System.out.println(t);
//     }
// }