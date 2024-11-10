
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.compareTo("END")==0){
                break;
            }
            String[] arr = s.toLowerCase().split("\\s+");
            String newName = "";
            for(int i=0; i<arr.length; i++){
                newName+=Character.toUpperCase(arr[i].charAt(0))+arr[i].substring(1)+" ";
            }
            System.out.println(newName);
        }
    }
}
