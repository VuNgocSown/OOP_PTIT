/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;

/**
 *
 * @author 84971
 */
public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=1; k<=t; k++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    a[i][j]=sc.nextInt();
                }
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    b[j][i]=a[i][j];
                }
            }
            int[][] c = new int[n][n];
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    c[i][j]=0;
                    for(int h = 0; h < m; h++){
                        c[i][j] += a[i][h]*b[h][j];
                    }
                }
            }
            System.out.println("Test "+k+":");
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }
}
