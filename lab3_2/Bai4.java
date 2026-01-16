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

public class Bai4 {
    double radius;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        radius = sc.nextDouble();
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    boolean isBigCircle() {
        return getArea() > 100;
    }

    public static void main(String[] args) {
        Bai4 c = new Bai4();
        c.input();
        System.out.println("Dien tich: " + c.getArea());
        System.out.println("Chu vi: " + c.getPerimeter());
        System.out.println(c.isBigCircle() ? "Hinh tron lon" : "Hinh tron nho");
    }
}

