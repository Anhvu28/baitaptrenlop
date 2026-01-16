/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3.pkg11;

/**
 *
 * @author ADMIN
 */
public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }
 
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
    }

    public double checkBalance() {
        return balance;
    }
    public void display() {
        System.out.println("STK: " + accountNumber +
                " – Chu tai khoan: " + ownerName +
                " – So du: " + balance);
    }
}
