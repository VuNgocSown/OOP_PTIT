/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaptit;

import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class JavaPTIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='3' || s.charAt(i)=='5'){
                cnt++;
            }
        }
        if(cnt == 3 || cnt == 5){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
