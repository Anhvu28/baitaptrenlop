/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3.pkg11;

/**
 *
 * @author ADMIN
 */
public class MainCi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circle c = new Circle();
        c.input();
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println("Big Circle: " + c.isBigCircle());
    }
    }
    