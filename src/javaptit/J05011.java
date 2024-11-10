/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class J05011 {
    public static class Net{
        private String id;
        private String name;
        private String in;
        private String out;

        public Net(String id, String name, String in, String out) {
            this.id = id;
            this.name = name;
            this.in = in;
            this.out = out;
        }
        public int getMinute(String time){
            String[] arr = time.split(":");
            int hour = Integer.parseInt(arr[0]);
            int minute = Integer.parseInt(arr[1]);
            return hour*60 + minute;
        }
        public int differenceTime(){
            int timeIn = getMinute(this.in);
            int timeOut = getMinute(this.out);
            return timeOut - timeIn;
        }
        public String convertTime(){
            int totalTime = differenceTime();
            int hour = totalTime/60;
            int minute = totalTime % 60;
            return String.format("%d gio %d phut", hour, minute);
        }
        @Override
        public String toString(){
            return this.id+" "+this.name+" "+convertTime();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Net[] nets = new Net[n];
        sc.nextLine();
        for(int i=0; i<n; i++){
            nets[i] = new Net(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(nets, new Comparator<Net>(){
            @Override
            public int compare(Net n1, Net n2){
                return n2.differenceTime() - n1.differenceTime();
            }
        });
        for(Net net:nets){
            System.out.println(net);
        }
    }
}
