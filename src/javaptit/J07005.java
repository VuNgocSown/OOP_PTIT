/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author 84971
 */
public class J07005 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA,in"));
        for(int i=0; i<100000; i++){
            int number = dis.readInt();
            map.put(number, map.getOrDefault(number, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
