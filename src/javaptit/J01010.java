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
public class J01010 {
    public static boolean valid(String n)
    {
        for(int i=0; i<n.length(); i++){
            if(n.charAt(i)!='1'&& n.charAt(i)!='8' && n.charAt(i)!='9' && n.charAt(i)!='0'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long n = sc.nextLong();
            String tmp=""+n;
            if(valid(tmp)){
                StringBuilder sb = new StringBuilder(tmp);
                for(int i=0; i<sb.length(); i++){
                    if(sb.charAt(i)=='1'){
                        sb.setCharAt(i, '1');
                    }
                    else{
                        sb.setCharAt(i,'0');
                    }
                }
                String newStr=sb.toString();
                Long result = Long.parseLong(newStr);
                if(result == 0){
                    System.out.println("INVALID");
                }
                else{
                    System.out.println(result);
                }
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
