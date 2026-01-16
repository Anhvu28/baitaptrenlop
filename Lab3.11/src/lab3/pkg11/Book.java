/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package  lab3.pkg11;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Book {
    private String tieuDe, tacGia;
    private double gia;
    private int nam;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tiêu đề: ");
        tieuDe = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        tacGia = sc.nextLine();
        System.out.print("Nhập giá: ");
        gia = sc.nextDouble();
        System.out.print("Nhập năm: ");
        nam = sc.nextInt();
    }

    public void hienThi() {
        System.out.println("Tiêu đề: " + tieuDe +
                " – Tác giả: " + tacGia +
                " – Giá: " + gia +
                " – Năm: " + nam);
    }

    public boolean sachDat() {
        return gia > 200000;
    }

    public boolean sachCu() {
        return nam < 2015;
    }
}
