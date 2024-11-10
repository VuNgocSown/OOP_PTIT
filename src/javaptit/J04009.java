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
public class J04009 {
    public static class Point{
        private double x;
        private double y;
        public Point(){
            
        }
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
        public Point(Point p){
            this.x = p.x;
            this.y = p.y;
        }
        public double getX(){
            return this.x;
        }
        public double getY(){
            return this.y;
        }
        public double distance(Point secondPoint){
            double dx = this.x - secondPoint.x;
            double dy = this.y - secondPoint.y;
            return Math.sqrt(dx*dx + dy*dy);
        }
        public static double distance(Point p1, Point p2){
            double dx = p1.x - p2.x;
            double dy = p1.y - p2.y;
            return Math.sqrt(dx*dx + dy*dy);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);
            double a = Point.distance(p1, p2);
            double b = Point.distance(p1, p3);
            double c = Point.distance(p2, p3);
            if((x1 == x2 && x1 == x3) || (y1 == y2 && y1 == y3) || a + b <= c || a + c <= b || b + c <= a){
                System.out.println("INVALID");
            }
            else{
                double R = (a*b*c)/Math.sqrt((a + b + c) * (a + b - c ) * (-a + b + c) * (a - b + c));
                System.out.printf("%.3f\n", R*R*Math.PI);
            }
        }
    }
}