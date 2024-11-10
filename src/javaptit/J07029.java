package javaptit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
public class J07029 {
    public static boolean isPrime(int n){
        for(int i=2; i<=(int)(Math.sqrt(n)); i++){
            if(n%i==0){
                return false;
            }
        }
        return n > 1;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> arr = new ArrayList<>();
//        int n =sc.nextInt();
//        for(int i=0; i<n; i++){
//            int x = sc.nextInt();
//            if(isPrime(x)){
//                arr.add(x);
//            }
//        }
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        ois.close();
        ArrayList<Integer> arr = new ArrayList<>();
        for(Integer ele:list){
            if(isPrime(ele)){
                arr.add(ele);
            }
        }
        Collections.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o2-o1;
            }
        });
        Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for(int i=0; i<arr.size(); i++){
            if(map.containsKey(arr.get(i))){
                map.replace(arr.get(i), map.get(arr.get(i))+1);
            }
            else{
                map.put(arr.get(i), 1);
            }
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(count >= 10) break;
            System.out.println(entry.getKey()+" "+entry.getValue());
            count++;
        }
    }
}