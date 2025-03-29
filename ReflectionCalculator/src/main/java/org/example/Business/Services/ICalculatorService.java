package org.example.Business.Services;

import org.example.Business.DTOs.RequestDTO;
import org.example.Business.DTOs.ResponseDTO;

import java.util.ArrayList;

public interface ICalculatorService {
    public ResponseDTO calculate(RequestDTO request);

    public ArrayList<String> getAllOperationNames();
}
