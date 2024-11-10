/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

/**
 *
 * @author 84971
 */
import java.util.Scanner;
public class J01003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a, b;
        a = sc.nextDouble();
        b = sc.nextDouble();
        if(a == 0 && b != 0){
            System.out.println("VN");
        }
        else if(a == 0 && b == 0){
            System.out.println("VSN");
        }
        else{
            System.out.printf("%.2f\n", -b/a);
        }
    }
}
