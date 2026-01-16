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

public class Bai5 {
    String accountNumber;
    String ownerName;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tai khoan: ");
        accountNumber = sc.nextLine();
        System.out.print("Nhap ten chu tai khoan: ");
        ownerName = sc.nextLine();
        System.out.print("Nhap so du ban dau: ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("So tien nap khong hop le!");
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Khong du so du de rut!");
    }

    double checkBalance() {
        return balance;
    }

    void display() {
        System.out.println("STK: " + accountNumber +
                " - Chu tai khoan: " + ownerName +
                " - So du: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai5 acc = new Bai5();

        acc.input();
        acc.display();

        System.out.print("Nhap so tien muon nap: ");
        double nap = sc.nextDouble();
        acc.deposit(nap);
        System.out.println("So du hien tai: " + acc.checkBalance());

        System.out.print("Nhap so tien muon rut: ");
        double rut = sc.nextDouble();
        acc.withdraw(rut);
        System.out.println("So du hien tai: " + acc.checkBalance());
    }
}
