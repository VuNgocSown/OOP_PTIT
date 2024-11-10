import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class MatHang {
    private String maMatHang;
    private String tenMatHang;
    private String donViTinh;
    private int giaMua;
    private int giaBan;
    private int loiNhuan;

    public MatHang(int stt, String tenMatHang, String donViTinh, int giaMua, int giaBan) {
        this.maMatHang = String.format("MH%03d", stt);
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    public int getLoiNhuan() {
        return loiNhuan;
    }

    public String getMaMatHang() {
        return maMatHang;
    }

    @Override
    public String toString() {
        return maMatHang + " " + tenMatHang + " " + donViTinh + " " + giaMua + " " + giaBan + " " + loiNhuan;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = Integer.parseInt(in.nextLine().trim());
        List<MatHang> ds = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            String tenMatHang = in.nextLine().trim();
            String donViTinh = in.nextLine().trim();
            int giaMua = Integer.parseInt(in.nextLine().trim());
            int giaBan = Integer.parseInt(in.nextLine().trim());
            ds.add(new MatHang(i, tenMatHang, donViTinh, giaMua, giaBan));
        }
        Collections.sort(ds, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if (o2.getLoiNhuan() != o1.getLoiNhuan()) {
                    return o2.getLoiNhuan() - o1.getLoiNhuan();
                }
                return o1.getMaMatHang().compareTo(o2.getMaMatHang());
            }
        });
        for (MatHang mh : ds) {
            System.out.println(mh);
        }
    }
}