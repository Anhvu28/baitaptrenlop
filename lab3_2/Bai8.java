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

public class Bai8 {
    String title, author;
    double price;
    int year;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tieu de: ");
        title = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        author = sc.nextLine();
        System.out.print("Nhap gia: ");
        price = sc.nextDouble();
        System.out.print("Nhap nam: ");
        year = sc.nextInt();
    }

    void display() {
        System.out.println("Title: " + title +
                " - Author: " + author +
                " - Price: " + price +
                " - Year: " + year);
    }

    boolean isExpensive() {
        return price > 200000;
    }

    boolean isOldBook() {
        return year < 2015;
    }

    public static void main(String[] args) {
        Bai8 b = new Bai8();
        b.input();
        b.display();

        if (b.isExpensive())
            System.out.println("Sach co gia cao");
        if (b.isOldBook())
            System.out.println("Sach xuat ban truoc nam 2015");
    }
}

