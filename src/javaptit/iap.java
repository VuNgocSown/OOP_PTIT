/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

/**
 *
 * @author 84971
 */
public class iap {
    
    //ko kt inner
    //con ko bao gio goi duoc ham tao cua cha
    /*
    -private
    +public
    dung extend de ke thua
    # giua c++ va java: java cho don thua ke
    sau tu khoa extends chi co ten 1 lop
    members: lop trong 1 lop, thuoc tinh, getter, setter, ham tao(khong duoc thua ke)
    ->tu khoa super: luon dung dau ham tao cua lop con
    bai kt dau lang nhang de kt kien thuc
    nap chong chi xay ra trong 1 lop
    chi co than khi co static hoac default
    ko bao gio tao doi tuong tu interface
    interface: da thua ke
    + minh phai quan ly doi tuong thuoc cac lop khong lien quan toi nhau, dung khung
    ko lam innner va anonymous
    hoc xong collections kt 2
    */
    public static void main(String[] args) {
        Cha c = new Con1();
//        Con1 cc = new Cha();
        
    }
    
}
class Cha{
    private String name;
    
}
class Con1 extends Cha{
    
}
