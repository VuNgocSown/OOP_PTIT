/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author 84971
 */
public class J07001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.next());
            if(map.containsKey(n)){
                int ts = map.get(n);
                map.put(n, ts+1);
            }
            else{
                map.put(n, 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer, Integer> entry : entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
