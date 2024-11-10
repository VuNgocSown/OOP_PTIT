/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class J05046 {
    private static HashMap<String, Integer> map = new HashMap<>();
    public static class MH{
        private String id;
        private String name;
        private int quantity;
        private int price;

        public MH(String name, int quantity, int price) {
            this.id = generateId(name);
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }
        public String generateId(String name){
            String[] arr = name.split("\\s+");
            String kt="";
            for(int i=0; i<2; i++){
                kt+=Character.toUpperCase(arr[i].charAt(0));
            }
//            return kt;
            if(!map.containsKey(kt)){
                map.put(kt, 1);
            }
            else{
                map.put(kt, map.get(kt)+1);
            }
            return String.format(kt+"%02d",map.get(kt));
        }
        public long totalPrice(){
            return (long)quantity*price;
        }
        public long discount(){
            if(quantity > 10){
                return (long)(totalPrice()*0.05);
            }
            else if(quantity>=8 && quantity <= 10){
                return (long)(totalPrice()*0.02);
            }
            else if(quantity>=5 && quantity<8){
                return (long)(totalPrice()*0.01);
            }
            return 0;
        }
        @Override
        public String toString(){
            return id+" "+name+" "+discount()+" "+(totalPrice()-discount());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MH[] mhs = new MH[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            mhs[i] = new MH(sc.nextLine(), sc.nextInt(), sc.nextInt());
        }
        for(MH mh:mhs){
            System.out.println(mh);
        }
    }
}
