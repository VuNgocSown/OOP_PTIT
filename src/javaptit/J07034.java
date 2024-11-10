
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 84971
 */
public class J07034 {
    public static class MH{
        private String id;
        private String name;
        private int tc;

        public MH(String id, String name, int tc) {
            this.id = id;
            this.name = name;
            this.tc = tc;
        }
        
        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getTc() {
            return tc;
        }
        @Override
        public String toString(){
            return id+" "+name+" "+tc;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.txt"));
        int n = sc.nextInt();
        MH[] mhs = new MH[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            mhs[i] = new MH(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        Arrays.sort(mhs, new Comparator<MH>(){
            @Override
            public int compare(MH o1, MH o2) {
                return o1.getName().compareTo(o2.getName());
            }
            
        });
        for(MH mh:mhs){
            System.out.println(mh);
        }
    }
}
