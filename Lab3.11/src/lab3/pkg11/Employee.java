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
public class Employee {
     String id, name;
    double salary;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        id = sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("ID: " + id + " – Name: " + name + " – Salary: " + salary);
    }

    double calculateTax() {
        if (salary > 10000000)
            return salary * 0.1;
        return 0;
    }
}
