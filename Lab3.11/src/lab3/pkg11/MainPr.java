/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package  lab3.pkg11;

/**
 *
 * @author ADMIN
 */
public class MainPr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Product sp = new Product();

        sp.nhap();           
        sp.giamGia(10);      
        sp.hienThi();      

        System.out.println("Tổng tiền: " + sp.tinhTongTien());
    }
}
