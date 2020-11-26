package calculator;

import org.junit.Assert;
import org.junit.Test;


public class OperatorTest {

    @Test
    public void shouldConvertSignToProperOperator() {
        String signPlus = "+";
        String signMinus = "-";
        String signMultiply = "*";
        String signDivide = "/";
        String signModulo = "%";

        Operator operatorPlus = Operator.getOperatorFromSign(signPlus);
        Operator operatorMinus = Operator.getOperatorFromSign(signMinus);
        Operator operatorMultiply = Operator.getOperatorFromSign(signMultiply);
        Operator operatorDivide = Operator.getOperatorFromSign(signDivide);
        Operator operatorModulo = Operator.getOperatorFromSign(signModulo);

        Assert.assertEquals(Operator.ADDITION, operatorPlus);
        Assert.assertEquals(Operator.SUBTRACTION, operatorMinus);
        Assert.assertEquals(Operator.MULTIPLICATION, operatorMultiply);
        Assert.assertEquals(Operator.DIVISION, operatorDivide);
        Assert.assertEquals(Operator.MODULO, operatorModulo);
    }

    @Test
    public void shouldAddTwoNumbers(){
        MathOperation mathOperation = new MathOperation(Operator.ADDITION, 10,2);
        int result = mathOperation.operator.calculate(10,2);
        Assert.assertEquals(12, result);
    }

    @Test
    public void shouldSubtractTwoNumbers(){
        MathOperation mathOperation = new MathOperation(Operator.SUBTRACTION, 10,2);
        int result = mathOperation.operator.calculate(10,2);
        Assert.assertEquals(8, result);
    }

    @Test
    public void shouldMultiplyTwoNumbers(){
        MathOperation mathOperation = new MathOperation(Operator.MULTIPLICATION, 10,2);
        int result = mathOperation.operator.calculate(10,2);
        Assert.assertEquals(20, result);
    }

    @Test
    public void shouldDivideTwoNumbers(){
        MathOperation mathOperation = new MathOperation(Operator.DIVISION, 10,2);
        int result = mathOperation.operator.calculate(10,2);
        Assert.assertEquals(5, result);
    }

    @Test
    public void shouldReturnRemainderOfDivisionOfTwoNumbers(){
        MathOperation mathOperation = new MathOperation(Operator.MODULO, 9,2);
        int result = mathOperation.operator.calculate(9,2);
        Assert.assertEquals(1, result);
    }


}
