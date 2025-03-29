package org.example.Business.DTOs;

public class RequestDTO {
    private String operatorName;
    private double firstOperand;
    private double secondOperand;

    public RequestDTO() {}

    public RequestDTO(String operatorName, double firstOperand, double secondOperand) {
        this.operatorName = operatorName;
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    /* * GETS * */
    public String getOperatorName() { return operatorName;}

    public double getFirstOperand() { return firstOperand;}

    public double getSecondOperand() { return secondOperand;}

    /* * SETS * */
    public void setOperatorName(String operatorName) {this.operatorName = operatorName;}

    public void setFirstOperand(double firstOperand) {this.firstOperand = firstOperand;}

    public void setSecondOperand(double secondOperand) {this.secondOperand = secondOperand;}

}
