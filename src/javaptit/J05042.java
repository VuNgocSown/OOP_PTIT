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
public class J05042 {
    public static class SV{
        private String name;
        private int accurate;
        private int submit;

        public SV(String name, int accurate, int submit) {
            this.name = name;
            this.accurate = accurate;
            this.submit = submit;
        }

        public int getAccurate() {
            return accurate;
        }

        public int getSubmit() {
            return submit;
        }

        public String getName() {
            return name;
        }
        @Override
        public String toString(){
            return name+" "+accurate+" "+submit;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SV[] svs = new SV[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            svs[i] = new SV(sc.nextLine(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(svs, new Comparator<SV>(){
            @Override
            public int compare(SV sv1, SV sv2){
                if(sv1.getAccurate()!=sv2.getAccurate()){
                    return sv2.getAccurate()-sv1.getAccurate();
                }
                else if(sv1.getSubmit()!=sv2.getSubmit()){
                    return sv1.getSubmit()-sv2.getSubmit();
                }
                else{
                    return sv1.getName().compareTo(sv2.getName());
                }
            }
        });
        for(SV sv:svs){
            System.out.println(sv);
        }
    }
}
