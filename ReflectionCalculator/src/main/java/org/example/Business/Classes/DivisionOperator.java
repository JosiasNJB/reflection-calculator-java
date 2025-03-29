package org.example.Business.Classes;
import org.example.Business.Interfaces.IOperator;

public class DivisionOperator implements IOperator {

    @Override
    public double operation(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

}
