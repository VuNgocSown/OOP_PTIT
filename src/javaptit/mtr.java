package javaptit;

import java.util.Scanner;

public class mtr {
    public static class Matran {
        private int[][] a;
        public Matran(int n) {
            this.a = new int[n][n];
        }
        public Matran(int[][] a) {
            this.a = a;
        }

        public int[][] getMatran() {
            return this.a;
        }

        public int getKT() {
            return this.a.length;
        }

        public void input(Scanner in) {
            for (int i = 0; i < this.a.length; i++) {
                for (int j = 0; j < this.a[i].length; j++) {
                    this.a[i][j] = in.nextInt();
                }
            }
        }

        public void out() {
            for (int i = 0; i < this.a.length; i++) {
                for (int j = 0; j < this.a[i].length; j++) {
                    System.out.print(this.a[i][j] + " ");
                }
                System.out.println();
            }
        }

        public Matran tong(int[][] b) {
            int n = this.a.length;
            int[][] result = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    result[i][j] = this.a[i][j] + b[i][j];
                }
            }
            return new Matran(result);
        }
        public int[][] transpose() {
            int r = a.length;
            int c = a[0].length;
            int[][] b = new int[c][r];
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    b[j][i] = a[i][j];
            return b;
        }
        public int[][] multiply(int[][] a, int[][] b) {
            int r = a.length;
            int c = a[0].length;
            int r1 = b.length;
            int c1 = b[0].length;
            if (c != r1) throw new RuntimeException("Illegal matrix dimensions.");
            int[][] d = new int[r][c1];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c1; j++) {
                    for (int k = 0; k < r1; k++) {
                        d[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return d;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //nhap kich thuoc
        int n=sc.nextInt();
        Matran m=new Matran(n);
        //nhap ma tran a
        m.input(sc);
        Matran b=new Matran(m.getKT());
        //nhap ma tran b
        b.input(sc);
        Matran t=m.tong(b.getMatran());
        //viet ra ma tran tong
        t.out();
    }
}