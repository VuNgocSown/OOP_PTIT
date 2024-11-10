/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            arr.add(x);
        }
        boolean check = false;
        while(true){
            check = false;
            for(int i = arr.size()-1; i>0; i--){
                if((arr.get(i)+arr.get(i-1))%2==0){
                    arr.remove(i);
                    arr.remove(i-1);
                    check = true;
                    i--;
                }
            }
            if(!check){
                break;
            }
            
        }
        System.out.println(arr.size());
    }
}