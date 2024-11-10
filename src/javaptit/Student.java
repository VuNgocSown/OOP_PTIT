/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;
//import java.util.StringTokenizer;

public class Student {

    private String maSV;
    private String hoVaTenDem;
    private String ten;
    private int tuoi;
    private boolean gioiTinh;
    private double diem1;
    private double diem2;

    public void setMaSV(int number) {
        this.maSV = "D22DCCN" + number;
    }

    public void setDiem(double diem1, double diem2) {
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    public String getHoVaTen() {
        return this.hoVaTenDem + " " + this.ten;
    }

    public double getGPA() {
        return (this.diem1 + this.diem2 * 2) / 3;
    }

    public String getXepLoai() {
        double gpa = getGPA();
        if (gpa < 5) {
            return "yeu";
        } else if (gpa < 6.5) {
            return "trung binh";
        } else if (gpa < 8) {
            return "kha";
        } else if (gpa < 9) {
            return "gioi";
        } else {
            return "xuat sac";
        }
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                int number = sc.nextInt();
                sc.nextLine(); // consume newline
                setMaSV(number);
                break;
            } catch (Exception e) {
                System.out.println("nhap sai");
                sc.nextLine(); // consume invalid input
            }
        }

        this.hoVaTenDem = sc.nextLine();
        this.ten = sc.nextLine();

        while (true) {
            try {
                this.tuoi = sc.nextInt();
                if (this.tuoi < 18 || this.tuoi > 23) {
                    throw new Exception("Tuoi khong hop le");
                }
                break;
            } catch (Exception e) {
                System.out.println("nhap sai");
                sc.nextLine(); // consume invalid input
            }
        }

        while (true) {
            try {
                this.gioiTinh = sc.nextBoolean();
                break;
            } catch (Exception e) {
                System.out.println("nhap sai");
                sc.nextLine(); // consume invalid input
            }
        }

        while (true) {
            try {
                this.diem1 = sc.nextDouble();
                if (this.diem1 < 0 || this.diem1 > 10) {
                    throw new Exception("Diem khong hop le");
                }
                break;
            } catch (Exception e) {
                System.out.println("nhap sai");
                sc.nextLine(); // consume invalid input
            }
        }

        while (true) {
            try {
                this.diem2 = sc.nextDouble();
                if (this.diem2 < 0 || this.diem2 > 10) {
                    throw new Exception("Diem khong hop le");
                }
                break;
            } catch (Exception e) {
                System.out.println("nhap sai");
                sc.nextLine(); // consume invalid input
            }
        }
    }

    public void output() {
        System.out.printf("%s %s %d %s %.1f %s\n", this.maSV, getHoVaTen(), this.tuoi,
                (this.gioiTinh ? "nam" : "nu"), getGPA(), getXepLoai());
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        s.setDiem(4, 8);
        s.output();
        System.out.println(s.getHoVaTen() + " " + s.getXepLoai());
    }
}
