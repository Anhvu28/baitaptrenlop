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

public class Bai7 {
    String brand;
    String model;
    int speed;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap hang xe: ");
        brand = sc.nextLine();
        System.out.print("Nhap model xe: ");
        model = sc.nextLine();
        System.out.print("Nhap toc do ban dau: ");
        speed = sc.nextInt();
    }

    void accelerate(int value) {
        speed += value;
    }

    void brake(int value) {
        speed -= value;
        if (speed < 0)
            speed = 0;
    }

    void displayStatus() {
        System.out.println("Model: " + model + " - Speed: " + speed);
    }

    boolean isOverSpeed() {
        return speed > 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai7 car = new Bai7();

        car.input();

        System.out.print("Nhap gia tri tang toc: ");
        int tang = sc.nextInt();
        car.accelerate(tang);

        System.out.print("Nhap gia tri giam toc: ");
        int giam = sc.nextInt();
        car.brake(giam);

        car.displayStatus();

        if (car.isOverSpeed())
            System.out.println("Xe dang vuot qua toc do cho phep");
        else
            System.out.println("Xe chay dung toc do");
    }
}
