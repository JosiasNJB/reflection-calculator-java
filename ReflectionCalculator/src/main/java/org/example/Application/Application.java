package org.example.Application;
import org.example.Controller.CalculatorController;
import org.example.View.Menu;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Menu menu = new Menu();
            int answer = 1;

            while(answer == 1){
                CalculatorController.calculator(scanner, menu);

                System.out.println("\nDo you want to perform another operation? (1 - yes/ 0 - no)");
                answer = scanner.nextInt();
            }

            System.out.println("\nCalculator exited with success.");
            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
