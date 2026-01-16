/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package  lab3.pkg11;

import java.util.Scanner;

public class Circle {
    double radius;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
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
}
