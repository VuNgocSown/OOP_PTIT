package javaptit;

import java.util.Scanner;

public class vehicle  {
    public static class Vehicle {
        private String vin;
        private String manufacturer;
        private int year;
        private double cost;
        private String color;

        public void input(Scanner in) {
            vin = in.nextLine();
            manufacturer = in.nextLine();
            color = in.nextLine();
            year = in.nextInt();
            cost = in.nextDouble();
            in.nextLine(); // Consume the newline character
        }

        @Override
        public String toString() {
            return vin + " " + manufacturer + " " + cost + " " + year + " " + color;
        }
    }

    public static class MS {
        private int n;
        private Vehicle[] vs;

        public void input(Scanner in) {
            n = in.nextInt();
            in.nextLine(); // Consume the newline character
            vs = new Vehicle[n];
            for (int i = 0; i < n; i++) {
                vs[i] = new Vehicle();
                vs[i].input(in);
            }
        }

        public void out() {
            for (int i = 0; i < n; i++) {
                System.out.println(vs[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MS ms = new MS();
        ms.input(in);
        ms.out();
    }
}