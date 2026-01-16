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

public class Bai6 {
    String id, name;
    double price;
    int quantity;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        id = sc.nextLine();
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap gia: ");
        price = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        quantity = sc.nextInt();
    }

    double getTotalPrice() {
        return price * quantity;
    }

    void discount(double percent) {
        price -= price * percent / 100;
    }

    void display() {
        System.out.println("ID: " + id + " - Name: " + name +
                " - Price: " + price + " - Quantity: " + quantity);
    }

    public static void main(String[] args) {
        Bai6 p = new Bai6();
        p.input();
        p.display();
        System.out.println("Tong tien: " + p.getTotalPrice());
        p.discount(10);
        System.out.println("Sau giam gia:");
        p.display();
    }
}
