package  lab3.pkg11;

import java.util.Scanner;

public class Rectangle {
    double length, width;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        length = sc.nextDouble();
        System.out.print("Width: ");
        width = sc.nextDouble();
    }

    double getArea() {
        return length * width;
    }

    double getPerimeter() {
        return 2 * (length + width);
    }

    void display() {
        System.out.println("Length: " + length + " – Width: " + width);
    }
}
