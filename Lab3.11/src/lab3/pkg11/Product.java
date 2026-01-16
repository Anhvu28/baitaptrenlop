/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package  lab3.pkg11;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Product {
     private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        maSP = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        tenSP = sc.nextLine();
        System.out.print("Nhập giá: ");
        gia = sc.nextDouble();
        System.out.print("Nhập số lượng: ");
        soLuong = sc.nextInt();
    }
    public double tinhTongTien() {
        return gia * soLuong;
    }
    public void giamGia(double phanTram) {
        if (phanTram > 0 && phanTram <= 100)
            gia = gia * (1 - phanTram / 100);
    }
    public void hienThi() {
        System.out.println("Mã SP: " + maSP +
                " - Tên SP: " + tenSP +
                " - Giá: " + gia +
                " - Số lượng: " + soLuong);
    }
}
