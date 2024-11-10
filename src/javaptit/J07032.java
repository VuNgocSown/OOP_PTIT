/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author 84971
 */
public class J07032 {
    public static boolean check(int num){
        String s = String.valueOf(num);
        for(int i=0; i<s.length()/2; i++){
            int digit = s.charAt(i)-'0';
            if(digit % 2 == 0){
                return false;
            }
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        if(s.length()%2==0 || s.length()<=1){
            return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
//        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
//        ArrayList<Integer> arr1 = (ArrayList<Integer>) ois1.readObject();
//        ArrayList<Integer> arr2 = (ArrayList<Integer>) ois2.readObject();
//        ois1.close();
//        ois2.close();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0; i<3; i++){
            int x = sc.nextInt();
            arr1.add(x);
        }
        for(int i=0; i<3; i++){
            int x = sc.nextInt();
            arr2.add(x);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(Integer ele:arr1){
            if(check(ele)){
                arr.add(ele);
            }
        }
        for(Integer ele:arr2){
            if(check(ele)){
                arr.add(ele);
            }
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(Integer ele:arr){
            if(map.containsKey(ele)){
                map.replace(ele, map.get(ele)+1);
            }
            else{
                map.put(ele, 1);
            }
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(count >= 10) break;
            System.out.println(entry.getKey()+" "+entry.getValue());
            count++;
        }
    }
}
