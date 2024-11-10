/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Collections;
/**
 *
 * @author 84971
 */
public class J07031 {
    public static boolean isPrime(int n){
        for(int i=2; i<=(int)(Math.sqrt(n)); i++){
            if(n%i==0){
                return false;
            }
        }
        return n > 1;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) ois2.readObject();
        ois1.close();
        ois2.close();
        Collections.sort(arr1, new Comparator<Integer>(){
           @Override
           public int compare(Integer o1, Integer o2){
               return o1-o2;
           }
        }); 
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        for(Integer ele:arr1){
            set1.add(ele);
        }
        for(Integer ele:arr2){
            set2.add(ele);
        }
        for(Integer ele:set1){
            if(isPrime(ele) && (1000000-ele)>ele){
                int ele2 = 1000000-ele;
                if(set1.contains(ele2) && isPrime(ele2) && !set2.contains(ele) && !set2.contains(ele2)){
                    System.out.println(ele+" "+ele2);
                }
            }
        }
    }
}
