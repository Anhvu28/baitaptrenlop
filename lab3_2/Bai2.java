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

public class Bai2 {
    double length, width;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        length = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        width = sc.nextDouble();
    }

    double getArea() {
        return length * width;
    }

    double getPerimeter() {
        return 2 * (length + width);
    }

    void display() {
        System.out.println("Length: " + length + " - Width: " + width);
    }

    public static void main(String[] args) {
        Bai2 r = new Bai2();
        r.input();
        r.display();
        System.out.println("Dien tich: " + r.getArea());
        System.out.println("Chu vi: " + r.getPerimeter());
    }
}

