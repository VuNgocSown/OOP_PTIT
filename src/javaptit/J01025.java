/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class J01025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        int[] b=new int[4];
        for(int i=0; i<4; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<4; i++){
            b[i]=sc.nextInt();
        }
        int x1 = Math.min(a[0], b[0]);
        int x2=Math.max(a[2], b[2]);
        int y1=Math.min(a[1], b[1]);
        int y2=Math.max(a[3], b[3]);
        int wide = x2-x1;
        int heigh = y2-y1;
        int c = Math.max(wide, heigh);
        System.out.println(c*c);
    }
}
