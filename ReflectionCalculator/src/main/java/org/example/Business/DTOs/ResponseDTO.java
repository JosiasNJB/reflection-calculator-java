package org.example.Business.DTOs;

public class ResponseDTO {
    public String operatorName;
    public double result;

    public ResponseDTO() {}
    public ResponseDTO(double result) { this.result = result;}

    /* * GETS * */
    public double getResult() { return result;}
    public String getOperatorName() { return operatorName;}

    /* * SETS * */
    public void setResult(double result) {this.result = result;}
    public void setOperatorName(String operatorName) {this.operatorName = operatorName;}
}
