
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J07022 {
    public static boolean check(String s){
        for(int i=0; i<s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))){
                return true;
            }
        }
        if(s.length()>9){
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        List<String> arr = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)){
                arr.add(s);
            }
        }
        Collections.sort(arr);
        for(String s:arr){
            System.out.print(s+" ");
        }
    }   
}
