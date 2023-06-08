package pro.skypro.pro.skypro.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    public String hello(){
        return "Welcome to the Calculator!";
    }

    public String plus(String num1, String num2){
        if ((num1 == "") || (num2 == "")) {
            return "Not all parameters are given";
        } else return num1+" + "+num2+ " = " + (Integer.parseInt(num1) + Integer.parseInt(num2));
    }

    public String minus(String num1, String num2){
        if ((num1 == "") || (num2 == "")) {
            return "Not all parameters are given";
        } else return num1+" - "+num2+ " = " + (Integer.parseInt(num1) - Integer.parseInt(num2));
    }

    public String multiply(String num1, String num2){
        if ((num1 == "") || (num2 == "")) {
            return "Not all parameters are given";
        } else return num1+" * "+num2+ " = " + (Integer.parseInt(num1) * Integer.parseInt(num2));
    }

    public String divide(String num1, String num2) {
        if ((num1 == "") || (num2 == "")) {
            return "Not all parameters are given";
        } else {
            if (Integer.parseInt(num2) == 0) {
                return "Division by zero!";
            } else return num1 + " / " + num2 + " = " + (Integer.parseInt(num1) / Integer.parseInt(num2));
        }
    }

}
