package org.example.View;

import org.example.Business.DTOs.RequestDTO;
import org.example.Business.DTOs.ResponseDTO;
import org.example.Controller.CalculatorController;

import java.util.Scanner;

public class Menu {

    public void showMenu(){
        System.out.println("Available operations:");
        //
        for (String operatorName : CalculatorController.getAllOperationNames()) {
            System.out.println("- " + operatorName);

        }
    }

    public String formattedInput(Scanner scanner) {
        String operatorName = scanner.nextLine().trim();

        if (operatorName.isEmpty()) {
            return formattedInput(scanner);
        }

        return operatorName.substring(0, 1).toUpperCase() + operatorName.substring(1).toLowerCase();
    }


    public RequestDTO requestInputs(Scanner scanner){
        RequestDTO request = new RequestDTO();

        System.out.println("\nChoose an operation(write the name of the chosen operation):");
        request.setOperatorName(formattedInput(scanner));

        System.out.println("Enter the value of the first operand:");
        request.setFirstOperand(scanner.nextDouble());
        System.out.println("Enter the value of the second operand:");
        request.setSecondOperand(scanner.nextDouble());

        return request;
    }

    public void showResult(ResponseDTO response){
        System.out.println("\nThe result of the " + response.getOperatorName() + " is: " + response.getResult());

    }
}
