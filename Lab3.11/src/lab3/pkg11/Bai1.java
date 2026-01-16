package  lab3.pkg11;

import java.util.Scanner;

public class Bai1 {
    String id, name;
    double score;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        id = sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Score: ");
        score = sc.nextDouble();
    }

    void display() {
        System.out.println(id + " - " + name + " - " + score
                + " - " + (isPass() ? "Pass" : "Fail"));
    }

    boolean isPass() {
        return score >= 5;
    }
}
