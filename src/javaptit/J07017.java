
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Pair<T1, T2>{
    private T1 first;
    private T2 second;
    public Pair(T1 first, T2 second){
        this.first = first;
        this.second = second;
    }
    public T1 getFirst(){
        return first;
    }
    public T2 getSecond(){
        return second;
    }
    public boolean isPrime(){
        return isPrime((Integer) first) && isPrime((Integer) second);
    }
    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString(){
        return first+" "+second;
    }
}
public class J07017 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
