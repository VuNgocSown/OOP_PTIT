/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author 84971
 */
public class J07007 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("VANBAN.in");
        Scanner sc = new Scanner(file);
        TreeSet<String> set = new TreeSet<>();
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            set.add(s);
        }
        for(String s : set){
            System.out.println(s);
        }
    }
}
