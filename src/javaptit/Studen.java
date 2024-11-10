package javaptit;

import java.util.Scanner;

public class Studen {
    public static class Person {
        private String name;
        private int age;

        public void input() {
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            age = sc.nextInt();
            sc.nextLine();
        }

        public void output() {
            System.out.println(name + " " + age);
        }
    }

    public static void main(String[] args) {
        Person[] prs = new Person[3];
        
        // Khởi tạo từng đối tượng Person trong mảng
        for (int i = 0; i < 3; i++) {
            prs[i] = new Person(); // Khởi tạo đối tượng Person
            prs[i].input();
        }

        for (Person ps : prs) {
            ps.output();
        }
    }
}