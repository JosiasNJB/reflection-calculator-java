package org.example.Business.Classes;
import org.example.Business.Interfaces.IOperator;

public class MultiplicationOperator implements IOperator {

    @Override
    public double operation(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

}
