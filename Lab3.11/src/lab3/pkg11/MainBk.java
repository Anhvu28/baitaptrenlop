/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3.pkg11;

/**
 *
 * @author ADMIN
 */
public class MainBk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BankAccount acc = new BankAccount();
         
        acc.deposit(500000);  
        acc.withdraw(200000); 
        acc.display();      
        System.out.println("So du hien tai: " + acc.checkBalance());
    }
}
  
