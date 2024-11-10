/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class J07040 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner sc = new Scanner(new File("DATA.txt"));
        ArrayList<String> arr1 = (ArrayList<String>) ois.readObject();
        ArrayList<String> list = new ArrayList<>();
        for(String str:arr1){
            String[] arr = str.toLowerCase().split("\\s+");
            for(String ele:arr){
                list.add(ele);
            }
        }
        LinkedHashSet<String> se = new LinkedHashSet<>();
        while(sc.hasNext()){
            se.add(sc.next().toLowerCase());
        }
//        for(String ele:se){
//            System.out.println(ele);
//        }
        for(String ele:se){
            if(list.contains(ele)){
                System.out.println(ele);
            }
        }
    }
}
