package javaptit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainQLTL {

    public static void main(String[] args) {
        QLTaiLieu q = new QLTaiLieu();
        Scanner in = new Scanner(System.in);
        List<TaiLieu> a = q.getA();
        IOFile.viet("tailieu.dat", a);
        List<Sach> b = new ArrayList<>();
        a.forEach(t -> {
            if(t instanceof Sach){
                b.add((Sach) t);
            }
        });
        //nhap
//        q.nhapSach(in);
//        q.nhapTapChi(in);
        q.out();
        //tim tren con
//        List<Sach> a=q.timTheoTenSach("cong nghe");
//        System.out.println("--------------------------");
//        for(Sach i:a){
//            System.out.println(i);
//        }
//xoa 1
//       q.xoaTheoMa("NNN8");
//        q.xoaTheoMa("s001");
//        q.out();
        //xoa nhieu - xoa theo ten
//        q.xoaTheoTen("lan lan");
//        q.xoaTheoTen("Tran dinh que");
//        q.out();

//          q.suaTaiLieu("bbbbbb", in);
//          q.suaTaiLieu("S001", in);
//          q.out();
            //sap xep theo so ban
            //q.sapxepTheoSoBanPH();
            //sap xep theo nha xb
//            q.sapxepTheoNXB();
//            q.out();
            //sap xep sach theo ten TG
//            List<Sach> b=new ArrayList<>();
//            for(TaiLieu k:((QLTaiLieu)q).getA()){
//                if(k instanceof Sach){
//                    b.add((Sach)k);
//                }
//            }
//            q.hienThi(b);
//            List<TapChi> c=new ArrayList<>();
//            for(TaiLieu k:((QLTaiLieu)q).getA()){
//                if(k instanceof TapChi){
//                    c.add((TapChi)k);
//                }
//            }
//            q.hienThi(c);
    }
}
