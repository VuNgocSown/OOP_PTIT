/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class J05048 {
    public static class IE{
        private String id;
        private int quantity;

        public IE(String id, int quantity) {
            this.id = id;
            this.quantity = quantity;
        }

        public long Export(){
            if(id.charAt(0)=='A'){
                return (long)(Math.round(0.6*quantity));
            }
            return (long)(Math.round(0.7*quantity));
        }
        public long price(){
            if(id.charAt(id.length()-1)=='Y'){
                return 110000;
            }
            else if(id.charAt(id.length()-1)=='N'){
                return 135000;
            }
            return 0;
        }
        public long totalPrice(){
            return (long)Export()*price();
        }
        public long tax(){
            if(id.charAt(0)=='A' && id.charAt(id.length()-1)=='Y'){
                return (long)(0.08*totalPrice());
            }
            else if(id.charAt(0)=='A' && id.charAt(id.length()-1)=='N'){
                return (long)(0.11*totalPrice());
            }
            else if(id.charAt(0)=='B' && id.charAt(id.length()-1)=='Y'){
                return (long)(0.17*totalPrice());
            }
            else if(id.charAt(0)=='B' && id.charAt(id.length()-1)=='N'){
                return (long)(0.22*totalPrice());
            }
            return 0;
        }
        public String getId(){
            return id;
        }
        @Override
        public String toString(){
            return id+" "+quantity+" "+Export()+" "+price()+" "+totalPrice()+" "+tax();
        }
    }
    public static boolean check(String s){
        if(s.charAt(0)!='A' && s.charAt(0)!='B'){
            return false;
        }
        if(s.charAt(s.length()-1)!='Y' && s.charAt(s.length()-1)!='N'){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        IE[] ies = new IE[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            ies[i] = new IE(sc.nextLine(), sc.nextInt());
        }
        for(IE ie:ies){
            if(check(ie.getId())){
                System.out.println(ie);
            }
        }
    }
}
