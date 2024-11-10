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
public class J05032 {
    public static class Age{
        private String name;
        private String birth;

        public Age(String name, String birth) {
            this.name = name;
            this.birth = birth;
        }

        public String getName() {
            return name;
        }

        public String getBirth() {
            String[] arr = this.birth.split("/");
            String newBirth = "";
            for(int i=arr.length-1; i>=0; i--){
                newBirth+=arr[i];
            }
            return newBirth;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Age[] ages = new Age[n];
        for(int i=0; i<n; i++){
            ages[i] = new Age(sc.next(), sc.next());
        }
        Arrays.sort(ages, new Comparator<Age>(){
            @Override
            public int compare(Age a1, Age a2){
                return a1.getBirth().compareTo(a2.getBirth());
            }
        });
        System.out.println(ages[ages.length-1].getName());
        System.out.println(ages[0].getName());
    }
}
