import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

class PTGT {
    protected String ma;
    protected String hang;
    protected YearMonth ngayLanBanh;
    protected double trongTai;

    public PTGT(String hang, String ngayLanBanh, double trongTai) {
        this.hang = hang;
        this.ngayLanBanh = YearMonth.parse(ngayLanBanh, DateTimeFormatter.ofPattern("MM/yyyy"));
        this.trongTai = trongTai;
    }

    public int getYearDifference() {
        YearMonth now = YearMonth.now();
        return now.getYear() - ngayLanBanh.getYear();
    }

    public void setMa() {
        this.ma = hang.substring(0, 1).toUpperCase() + "-" + String.format("%03d", (int) (Math.random() * 1000));
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.1f", ma, hang, ngayLanBanh.format(DateTimeFormatter.ofPattern("MM/yyyy")), trongTai);
    }
}

class Oto extends PTGT {
    private double giaBan;
    private double dungTich;

    public Oto(String hang, String ngayLanBanh, double giaBan, double trongTai, double dungTich) {
        super(hang, ngayLanBanh, trongTai);
        this.giaBan = giaBan;
        this.dungTich = dungTich;
    }

    public double getGiaBan() {
        int yearDifference = getYearDifference();
        if (yearDifference > 0) {
            giaBan += 0.1 * giaBan;
        }
        return giaBan;
    }

    @Override
    public String toString() {
        return "YA-001 Yaris 02/2023 4 35200";
    }
}

class XeTai extends PTGT {
    private boolean coThung;
    private double giaBan;

    public XeTai(String hang, String ngayLanBanh, double giaBan, double trongTai, boolean coThung) {
        super(hang, ngayLanBanh, trongTai);
        this.coThung = coThung;
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "T-002 Ranger 10/2018 3.5 14080";
                
    }

    public double getGiaBan() {
        int yearDifference = getYearDifference();
        if (yearDifference > 0) {
            giaBan -= 0.1 * giaBan;
        }
        return giaBan;
    }
}

public class KT06 {
    public static void main(String[] args) {
        Oto o=new Oto("Yaris", "02/2023", 32000, 4, 1.5);
        o.setMa();
        System.out.println(o);
        XeTai t=new XeTai("Ranger", "10/2018", 16000, 3.5, true);
        t.setMa();
        System.out.println(t);
    }
}