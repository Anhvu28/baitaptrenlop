/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package  lab3.pkg11;

/**
 *
 * @author ADMIN
 */
public class MainCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Car xe = new Car();
        xe.tangToc(120);
        xe.hienThi();

        if (xe.vuotTocDo())
            System.out.println("Vuot toc do!");
    }
    }
    
