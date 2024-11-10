import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KT11 {
    public static class Sach {
        protected String ma;
        protected String ten;
        protected String nhaXB;
        protected double gia;
        protected static int sMa = 1;

        public Sach(String ten, String nhaXB, double gia) {
            this.ten = ten;
            this.nhaXB = chuanHoa(nhaXB);
            this.ma = generateMa();
            this.gia = gia;
        }

        public String chuanHoa(String s) {
            s = s.toLowerCase();
            String newName = "";
            String[] arr = s.split("\\s+");
            newName += Character.toUpperCase(arr[0].charAt(0)) + arr[0].substring(1);
            for (int i = 1; i < arr.length; i++) {
                newName += " " + arr[i];
            }
            return newName;
        }

        public String getNhaXB() {
            return nhaXB;
        }

        public double getGia() {
            return gia;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + nhaXB + " " + (int)gia;
        }

        public String generateMa() {
            String newName = "";
            String[] arr = nhaXB.split("\\s+");
            for (int i = 0; i < arr.length; i++) {
                newName += Character.toUpperCase(arr[i].charAt(0));
            }
            return newName + String.format("%03d", sMa++);
        }
    }

    public static class QLSach {
        private List<Sach> a;

        public QLSach() {
            a = new ArrayList<>();
        }

        public void nhap(Scanner in) {
            String ten = in.nextLine();
            String nhaXB = in.nextLine();
            double gia = in.nextDouble();
            in.nextLine();
            a.add(new Sach(ten, nhaXB, gia));
        }

        public void minGiaTheoNXB() {
            Map<String, Optional<Sach>> minGiaMap = a.stream()
                .collect(Collectors.groupingBy(
                    Sach::getNhaXB,
                    Collectors.minBy(Comparator.comparingDouble(Sach::getGia))
                ));

            for (Map.Entry<String, Optional<Sach>> entry : minGiaMap.entrySet()) {
                if (entry.getValue().isPresent()) {
                    System.out.println(entry.getKey() + ":" + entry.getValue().get());
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QLSach q=new QLSach();
        for (int i = 0; i < 4; i++) {
            q.nhap(in);
        }
        q.minGiaTheoNXB();
    }
}