package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class ExpressionTest {
    private static double POSITIVE_A = 1.2325;
    private static double POSITIVE_B = 3.1534;
    private static double POSITIVE_RESULT = 4.3858;

    private static double NEGATIVE_A = -1.0005;
    private static double NEGATIVE_B = -4.6133;
    private static double NEGATIVE_RESULT = -5.6137;

    @Test
    public void isSumWithinMarginPositiveNumber() {
        Expression expression = new Expression();
        boolean actualResult = expression.doubleExpression(POSITIVE_A, POSITIVE_B, POSITIVE_RESULT);
        Assert.assertTrue("Test failed with parameters: a = " + POSITIVE_A
                        + ", b = " + POSITIVE_B
                        + ", c = " + POSITIVE_RESULT,
                actualResult);
    }

    @Test
    public void isSumWithinMarginNegativeNumber() {
        Expression expression = new Expression();
        boolean actualResult = expression.doubleExpression(NEGATIVE_A, NEGATIVE_B, NEGATIVE_RESULT);
        Assert.assertTrue("Test failed with parameters: a = " + NEGATIVE_A
                        + ", b = " + NEGATIVE_B
                        + ", c = " + NEGATIVE_RESULT,
                actualResult);
    }
}
