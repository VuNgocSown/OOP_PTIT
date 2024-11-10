package javaptit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J06001{
    public static class SP{
        private String id;
        private String name;
        private int type1;
        private int type2;

        public SP(String id, String name, int type1, int type2) {
            this.id = id;
            this.name = name;
            this.type1 = type1;
            this.type2 = type2;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }
        
        public int getType1() {
            return type1;
        }

        public int getType2() {
            return type2;
        }
        
    }
    public static class Invoice{
        private String id;
        private String name;
        private long discount;
        private long price;

        public Invoice(String id, String name, long discount, long price) {
            this.id = id;
            this.name = name;
            this.discount = discount;
            this.price = price;
        }
        @Override
        public String toString(){
            return id + " "+ name+" "+discount+" "+price;
        }
    }
    public static long voucher(long quantity, long price){
        if(quantity >= 150){
            return quantity*price*50/100;
        }
        else if(quantity >= 100){
            return quantity*price*30/100;
        }
        else{
            return quantity*price*15/100;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, SP> map = new HashMap<>();
        for(int i=0; i<n; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int price1 = Integer.parseInt(sc.nextLine());
            int price2 = Integer.parseInt(sc.nextLine());
            map.put(id, new SP(id, name, price1, price2));
        }
        int m = sc.nextInt();
        sc.nextLine();
        Invoice[] ins = new Invoice[m];
        for(int i=0; i<m; i++){
            String[] inv = sc.nextLine().split(" ");
            String codeP = inv[0].substring(0, 2);
            int type = Integer.parseInt(inv[0].substring(2, 3));
            long quantity = Integer.parseInt(inv[1]);
            SP sp = map.get(codeP);
            long price = 0;
            if(type == 1){
                price = sp.getType1();
            }
//            else if{
//                price = sp.getType2();
//            }
            String fullCode = inv[0] + "-" + String.format("%03d", i+1);
            String name = sp.getName();
            long discount = voucher(quantity, price);
            long total = quantity*price-discount;
            ins[i] = new Invoice(fullCode, name, discount, total);
        }
        for(Invoice in: ins){
            System.out.println(in);
        }
        //nhap sach, nhap tap chi, viet ra
        //tim tren con: dan giao dien
        // sua
        //cach 1: TaiLieu t=list.get(p)->sua
        //cach 2: sua Tai lieu t
    }
}