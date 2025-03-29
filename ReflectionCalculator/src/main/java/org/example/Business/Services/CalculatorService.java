package org.example.Business.Services;

import org.example.Business.Factory.Factory;
import org.example.Business.Interfaces.IOperator;
import org.reflections.Reflections;
import org.example.Business.DTOs.RequestDTO;
import org.example.Business.DTOs.ResponseDTO;

import java.util.ArrayList;
import java.util.Set;

public class CalculatorService implements ICalculatorService {

    @Override
    public ResponseDTO calculate(RequestDTO request) {
        ResponseDTO response = new ResponseDTO();
        IOperator operation = Factory.factory(request.getOperatorName() + "Operator");

        double firstOperand = request.getFirstOperand();
        double secondOperand = request.getSecondOperand();

        if (operation != null) {
           double result = operation.operation(firstOperand, secondOperand);
           response.setResult(result);
           response.setOperatorName(request.getOperatorName());

        }

        return response;
    }

    @Override
    public ArrayList<String> getAllOperationNames(){
        ArrayList<String> operatorNames = new ArrayList<String>();

        Reflections reflections = new Reflections("org.example.Business.Classes");

        Set<Class<? extends IOperator>> operatorClasses = reflections.getSubTypesOf(IOperator.class);

        for (Class<? extends IOperator> operatorClass : operatorClasses) {
            operatorNames.add(operatorClass.getSimpleName().replace("Operator", ""));

        }

        return operatorNames;
    }
}
