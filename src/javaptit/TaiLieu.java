package javaptit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class TaiLieu implements Comparable<TaiLieu>, Serializable{

    private String ma, tenNXB;
    private int soBan;

    public TaiLieu() {
    }

    public TaiLieu(String ma, String tenNXB, int soBan) {
        this.ma = ma;
        this.tenNXB = tenNXB;
        this.soBan = soBan;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    @Override
    public int compareTo(TaiLieu o) {
        //so ban PH tang dan int double 1.23  1.27
        //return this.soBan-o.getSoBan();
        //giam dan
        return o.getSoBan()-this.soBan;
        //String
        //return this.ma.compareToIgnoreCase(o.getMa());
    }

}

class Sach extends TaiLieu implements Serializable{

    private String tenTG, tenSach;
    private int soTrang;

    public Sach() {
    }

    public Sach(String ma,
            String tenNXB,
            int soBan, String tenTG,
            String tenSach,
            int soTrang
    ) {
        super(ma, tenNXB, soBan);
        this.tenTG = tenTG;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return getMa() + " "+tenSach +" "+ tenTG +" "+ getTenNXB()
                + " "+getSoBan() +" "+ soTrang;
    }
}

class TapChi extends TaiLieu implements Serializable{

    private int thang, spPH;

    public TapChi() {
    }

    public TapChi(String ma,
            String tenNXB, int soBan,
            int thang,
            int spPH
    ) {
        super(ma, tenNXB, soBan);
        this.thang = thang;
        this.spPH = spPH;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getSpPH() {
        return spPH;
    }

    public void setSpPH(int spPH) {
        this.spPH = spPH;
    }

    public String toString() {
        return getMa() + " "+thang +" "+ spPH +" "+ getTenNXB()+" "
                + getSoBan();
    }
}

interface ChucNang {

    //public TaiLieu nhap(Scanner in);

    public void nhapSach(Scanner in);

    public void nhapTapChi(Scanner in);
    public void out();

    public List<TaiLieu> timTheoTenNXB(String key);

    public List<Sach> timTheoTenSach(String key);

    public void xoaTheoMa(String ma);//xoa 1

    public void xoaTheoTen(String ten);//xoa nhieu

    public void suaTaiLieu(String ma,Scanner in);

    public void suaSach(String ma,Scanner in);

    public <T> void hienThi(List<T> a);
    //sap xep theo so int double
    public void sapxepTheoSoBanPH();
    //sap xep theo String
    public void sapxepTheoNXB();
    //2 tieu chi ho va ten
    
    //sap xep sach ho ten tac gia
    public void sapxepSachTheoTenTG();
    
}

class QLTaiLieu implements ChucNang {

    private List<TaiLieu> a;

    public List<TaiLieu> getA() {
        return a;
    }

    public void setA(List<TaiLieu> a) {
        this.a = a;
    }
    
    public QLTaiLieu() {
        a = new ArrayList<>();
        a.add(new Sach("S001", "Giao duc", 2000,
                "Vu The Que","Cong Nghe Phan Mem", 120));
        a.add(new Sach("S003", "Giao duc", 340,
                "Anh The Que","Cong Nghe Nang cao", 150));
        a.add(new Sach("S002", "Buu chinh", 400,
                "Trinh Thi Van Anh","Ky thuat Do Hoa", 120));
        a.add(new TapChi("TC001","Ptit", 20, 6, 1));
        a.add(new TapChi("TC002","Kim dong", 300, 5, 1));
        
    }

    
    private TaiLieu nhap(Scanner in) {
        String ma, ten;
        int so;
        while (true) {
            ma = in.nextLine();
            if (getTaiLieuByMa(ma) == null) {
                break;
            }
            System.err.print("trung ma");
        }
        ten = in.nextLine();
        so = Integer.parseInt(in.nextLine());
        return new TaiLieu(ma, ten, so);
    }

    public TaiLieu getTaiLieuByMa(String ma) {
        for (TaiLieu i : a) {
            if (i.getMa().equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return null;
    }
    public int getViTriTaiLieu(String ma) {
        for (int i=0;i<a.size();i++) {
            if (a.get(i).getMa().equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void nhapSach(Scanner in) {
        TaiLieu tl = nhap(in);
        String tenTG, tenSach;
        int soTrang;
        tenSach = in.nextLine();
        tenTG = in.nextLine();
        soTrang = Integer.parseInt(in.nextLine());
        a.add(new Sach(tl.getMa(),
                tl.getTenNXB(),
                tl.getSoBan(),
                tenTG, tenSach, soTrang));
    }

    @Override
    public void nhapTapChi(Scanner in) {
        TaiLieu tl = nhap(in);
        int thang,so;
        thang = Integer.parseInt(in.nextLine());
        so = Integer.parseInt(in.nextLine());
        a.add(new TapChi(tl.getMa(),
                tl.getTenNXB(),
                tl.getSoBan(),
                thang,so));
    }

    @Override
    public List<TaiLieu> timTheoTenNXB(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Sach> timTheoTenSach(String key) {
        List<Sach> list=new ArrayList<>();
        for(TaiLieu i:a){
            if(i instanceof Sach){
                if(((Sach)i).getTenSach().toLowerCase().contains(key.toLowerCase())){
                    list.add((Sach)i);
                }
            }
        }
        return list;
    }

    @Override
    public void xoaTheoMa(String ma) {
        TaiLieu t1 = getTaiLieuByMa(ma);
        if(t1 == null){
            System.out.println("Khong tim thay");
        }
        else{
            a.remove(t1);
        }
    }

    @Override
    public void xoaTheoTen(String tentg) {
        Iterator<TaiLieu> iterator = a.iterator();
        while (iterator.hasNext()) {
            TaiLieu i = iterator.next();
            if(i instanceof Sach){
                if(((Sach) i).getTenTG().compareTo(tentg)==0){
                    iterator.remove();
                }
            }
        }
    }

    @Override
    public void suaTaiLieu(String ma,Scanner in) {
        int p=getViTriTaiLieu(ma);
        if(p==-1){
            System.out.println("khong tim thay");
        }else{
            TaiLieu t=a.get(p);
            //sua
            t.setTenNXB(in.nextLine());
            t.setSoBan(Integer.parseInt(in.nextLine()));
            System.out.println("sua thanh con");
        }
    }

    @Override
    public void suaSach(String ma,Scanner in) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public <T> void hienThi(List<T> a) {
        for(T i:a){
            System.out.println(i);
        }
    }

    @Override
    public void out() {
        for(TaiLieu i:a){
            System.out.println(i);
        }
        System.out.println("Tong: "+a.size());
    }

    @Override
    public void sapxepTheoSoBanPH() {
        Collections.sort(a, new Comparator<TaiLieu>(){
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                return o1.getSoBan()-o2.getSoBan();
            }
            
        });
    }

    @Override
    public void sapxepTheoNXB() {
        Collections.sort(a, new Comparator<TaiLieu>(){
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                //tang dan
                return o1.getTenNXB().compareToIgnoreCase(o2.getTenNXB());
                //giam dan
                //return o2.getTenNXB().compareToIgnoreCase(o1.getTenNXB());
            }
    
    });
    }

    @Override
    public void sapxepSachTheoTenTG() {
        Collections.sort(a, new Comparator<TaiLieu>(){
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                if((o1 instanceof Sach) && (o2 instanceof Sach)){
                    Sach s1 = (Sach) o1;
                    Sach s2 = (Sach) o2;
                    String[] arr1 = s1.getTenTG().split("\\s+");
                    String[] arr2 = s2.getTenTG().split("\\s+");
                    if(arr1[arr1.length-1].compareTo(arr2[arr2.length-1])!= 0){
                        return arr1[arr1.length-1].compareTo(arr2[arr2.length-1]);
                    }
                    else{
                        return arr1[0].compareTo(arr2[0]);
                    }
                }
                return 0;
            }
            
        });
    }

}
