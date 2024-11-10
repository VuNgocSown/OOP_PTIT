/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class J03021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<Character, Integer> map = new HashMap<>();

        // Thêm các ký tự và giá trị tương ứng vào HashMap
        map.put('A', 2);
        map.put('B', 2);
        map.put('C', 2);
        
        map.put('D', 3);
        map.put('E', 3);
        map.put('F', 3);
        
        map.put('G', 4);
        map.put('H', 4);
        map.put('I', 4);
        
        map.put('J', 5);
        map.put('K', 5);
        map.put('L', 5);
        
        map.put('M', 6);
        map.put('N', 6);
        map.put('O', 6);
        
        map.put('P', 7);
        map.put('Q', 7);
        map.put('R', 7);
        map.put('S', 7);
        
        map.put('T', 8);
        map.put('U', 8);
        map.put('V', 8);
        
        map.put('W', 9);
        map.put('X', 9);
        map.put('Y', 9);
        map.put('Z', 9);
        while(t-- > 0){
            String s = sc.next();
            s=s.toUpperCase();
            String result = "";
            for(int i=0; i<s.length(); i++){
                result += map.get(s.charAt(i));
            }
            StringBuilder sb = new StringBuilder(result);
            sb.reverse();
            String rev = sb.toString();
//            System.out.println(rev + "\n" + result);
            if(rev.compareTo(result)==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
