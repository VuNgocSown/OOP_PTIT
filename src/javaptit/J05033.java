/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
/**
 *
 * @author 84971
 */
public class J05033 {
    public static class Time{
        private int hour;
        private int minute;
        private int second;
        public Time(int hour, int minute, int second){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        public int getHour(){
            return this.hour;
        }
        public int getMinute(){
            return this.minute;
        }
        public int getSecond(){
            return this.second;
        }
        @Override
        public String toString(){
            return this.hour + " " + this.minute + " " + this.second;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Time[] times = new Time[t];
        for(int i=0; i<t; i++){
            int gio = sc.nextInt();
            int phut = sc.nextInt();
            int giay = sc.nextInt();
            times[i] = new Time(gio, phut, giay);
        }
        Arrays.sort(times, new Comparator<Time>(){
            @Override
            public int compare(Time t1, Time t2){
                if(t1.getHour()!=t2.getHour()){
                    return t1.getHour() - t2.getHour();
                }
                else if(t1.getMinute()!=t2.getMinute()){
                    return t1.getMinute()-t2.getMinute();
                }
                else{
                    return t1.getSecond()-t2.getSecond();
                }
            }
        });
        for(Time time : times){
            System.out.println(time);
        }
    }
}
