package org.example.Controller;
import org.example.Business.Services.CalculatorService;
import org.example.Business.Services.ICalculatorService;
import org.example.Business.DTOs.ResponseDTO;
import org.example.Business.DTOs.RequestDTO;
import org.example.View.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorController {

    public static void calculator(Scanner scanner, Menu menu){
        menu.showMenu();

        RequestDTO request = menu.requestInputs(scanner);
        ResponseDTO response = CalculatorController.calculate(request);

        menu.showResult(response);
    }

    public static ResponseDTO calculate(RequestDTO request){
        ICalculatorService calculatorService = new CalculatorService();

        return calculatorService.calculate(request);
    }

    public static ArrayList<String> getAllOperationNames(){
          ICalculatorService calculatorService = new CalculatorService();

          return calculatorService.getAllOperationNames();
    }
}
