/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author 84971
 */
public class MainGeneric {
    public static void main(String[] args) {
        SVInteger s1 = new SVInteger(1, "To an an");
        System.out.println(s1);
        SVDouble s2 = new SVDouble(1.0, "To an an");
        System.out.println(s1);
        SVString s3 = new SVString("1", "To an an");
        System.out.println(s3);
    }
}
class SVInteger{
    private int ma;
    private String ten;

    public SVInteger(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    
    @Override
    public String toString(){
        return ma+" "+ten;
    }
}
//generic class
class IOFile{
    public static <T> void viet(String fname, List<T> arr){
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fname));
            out.writeObject(arr);
            out.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public static <T> List<T> doc(String name){
        List<T> list = null;
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(name));
            
        }catch(IOException e){
            System.out.println(e);
        }
        return list;
    }
}
//nv: chay main1 
class SinhVien<T>implements Serializable{
    private T ma;
    private String ten;
    @Override
    public String toString(){
        return ma + " " + ten;
    }
}
//generic method
//bai lien quan den file
//2 lop, 3 lop
//tr74 slide file chc04
class SVDouble{
    private double ma;
    private String ten;

    public SVDouble(double ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    
}
class SVString{
    private String ma;
    private String ten;

    public SVString(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    
}
