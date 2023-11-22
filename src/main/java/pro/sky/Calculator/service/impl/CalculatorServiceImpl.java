package pro.sky.Calculator.service.impl;


import org.springframework.stereotype.Service;
import pro.sky.Calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String plus(int num1, int num2) {
        String error = calculatorError(num1, num2);
        if (error != null) {
            return error;
        }
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {
        String error = calculatorError(num1, num2);
        if (error != null) {
            return error;
        }
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        String error = calculatorError(num1, num2);
        if (error != null) {
            return error;
        }
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(int num1, int num2) {
        String error = calculatorError(num1, num2);
        if (error != null) {
            return error;
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }

    @Override
    public String calculatorError(int num1, int num2) {
        return null;
    }
}
