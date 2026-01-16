/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3.pkg11;

/**
 *
 * @author ADMIN
 */
public class MainBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Book s = new Book();   

        s.nhap();              
        s.hienThi();           

        if (s.sachDat()) System.out.println("Sách đắt");
        if (s.sachCu()) System.out.println("Sách cũ");
    }
}
