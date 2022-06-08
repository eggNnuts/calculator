import calculate.*;

import java.util.Arrays;

public enum Operator {
    ADD("+", new AdditionCalculator()),
    DIVIDE("/", new DivideCalculator()),
    MULTIPLE("*", new MultiplicationCalculator()),
    SUBTRACT("-", new SubtractionCalculator());

    private final String operatorCode;
    private final Calculator calculator;

    Operator(String operatorCode, Calculator calculator) {
        this.operatorCode = operatorCode;
        this.calculator = calculator;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public Operator getOperatorByOperatorCode(String operatorCode) {
        return Arrays.stream(values())
                .filter(operator -> getOperatorCode().equals(operatorCode))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException(ErrorCode.INVALID_OPERATOR.getErrorMessage()));
    }

}
