/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3.pkg11;

/**
 *
 * @author ADMIN
 */
public class MainEm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e = new Employee();
        e.input();
        e.display();
        System.out.println("Tax: " + e.calculateTax());
    }
    }
    
