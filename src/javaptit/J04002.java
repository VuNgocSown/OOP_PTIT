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
public class J04002 {
    public static class Rectange{
        private double width;
        private double height;
        private String color;
        public Rectange(){
            
        }
        public Rectange(double width, double height, String color){
            this.width = width;
            this.height = height;
            this.color = color;
        }
        public double getWidth(){
            return this.width;
        }
        public void setWidth(double width){
            this.width = width;
        }
        public double getHeight(){
            return this.height;
        }
        public void setHeight(double height){
            this.height = height;
        }
        public String getColor(){
            return this.color;
        }
        public void setColor(String color){
            this.color = color;
        }
        public double findArea(){
            return this.width * this.height;
        }
        public double findPerimeter(){
            return this.width*2 + this.height*2;
        }
    }
    public static String newColor(String color){
        String result = "";
        result += Character.toUpperCase(color.charAt(0));
        for(int i=1; i<color.length(); i++){
            result+=Character.toLowerCase(color.charAt(i));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double w = sc.nextDouble();
        String c = sc.next();
        if(h<=0 || w<=0){
            System.out.println("INVALID");
        }
        else{
            Rectange r = new Rectange(h, w, c);
            r.setColor(newColor(r.getColor()));
            System.out.printf("%.0f %.0f ", r.findPerimeter(), r.findArea());
            System.out.println(r.getColor());
        }
    }
}
