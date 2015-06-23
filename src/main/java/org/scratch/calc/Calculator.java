package org.scratch.calc;

/**
 * Created by Charles.Wang on 23/06/2015.
 */
public class Calculator
{
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }
}
