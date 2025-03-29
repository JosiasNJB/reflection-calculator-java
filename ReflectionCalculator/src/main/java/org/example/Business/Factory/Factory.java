package org.example.Business.Factory;

import org.example.Business.Interfaces.IOperator;

public class Factory {
    public static IOperator factory(String operator) {
        Object operatorObject = null;

        try {
            operatorObject = Class.forName("org.example.Business.Classes." + operator).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (IOperator) operatorObject;

    }
}
