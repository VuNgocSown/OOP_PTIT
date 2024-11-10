/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author 84971
 */
public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else{
                char x = st.peek();
                if(x == s.charAt(i)){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        String result = "";
        while(!st.isEmpty()){
            result += st.peek();
            st.pop();
        }
        StringBuilder sb = new StringBuilder(result);
        sb.reverse();
        result = sb.toString();
        if(result.length() == 0){
            System.out.println("Empty String");
        }
        else{
            System.out.println(result);
        }
    }
}
