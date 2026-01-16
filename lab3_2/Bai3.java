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

public class Bai3 {
    String id, name;
    double salary;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        id = sc.nextLine();
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap luong: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("ID: " + id + " - Name: " + name + " - Salary: " + salary);
    }

    double calculateTax() {
        return salary > 10000000 ? salary * 0.1 : 0;
    }

    public static void main(String[] args) {
        Bai3 e = new Bai3();
        e.input();
        e.display();

        double tax = e.calculateTax();
        if (tax == 0)
            System.out.println("Khong phai dong thue");
        else
            System.out.println("Thue phai dong: " + tax);
    }
}
