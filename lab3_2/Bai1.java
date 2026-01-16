/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3_2;

/**
 *
 * @author 84375
 */
import java.util.Scanner;

public class Bai1 {
    String id;
    String name;
    double score;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        id = sc.nextLine();
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap diem: ");
        score = sc.nextDouble();
    }

    void display() {
        System.out.println("ID: " + id + " - Name: " + name + " - Score: " + score);
    }

    boolean isPass() {
        return score >= 5;
    }

    public static void main(String[] args) {
        Bai1 s = new Bai1();
        s.input();
        s.display();

        if (s.isPass())
            System.out.println("Sinh vien DAT");
        else
            System.out.println("Sinh vien KHONG DAT");
    }
}

