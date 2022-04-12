package calculator;

public class Calculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int fisrtOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return fisrtOperand + secondOperand;
            case SUBTRACTION:
                return fisrtOperand - secondOperand;
            case MULTIPLICATION:
                return fisrtOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return fisrtOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
