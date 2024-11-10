import java.io.*;
import java.util.*;

public class J07004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int ts = map.getOrDefault(n, 0);
            map.put(n, ts + 1);
        }
        sc.close(); // Đóng Scanner sau khi sử dụng

        // Chuyển entrySet thành List
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Sắp xếp List dựa trên giá trị của các mục
        entryList.sort(Map.Entry.comparingByValue());

        // Ghi các mục đã sắp xếp vào tệp OUTPUT.txt
        File f = new File("OUTPUT.txt");
        try (FileWriter fw = new FileWriter(f);
             PrintWriter writer = new PrintWriter(fw)) {
            for (Map.Entry<Integer, Integer> entry : entryList) {
                writer.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (IOException e) {
        }
    }
}