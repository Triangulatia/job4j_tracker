package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class FunctionCalculationTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionCalculation.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = FunctionCalculation.diapason(1, 4, x -> 2 * Math.pow(x, 2) + 1);
        List<Double> expected = Arrays.asList(3D, 9D, 19D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = FunctionCalculation.diapason(1, 4, x -> 2 * Math.pow(2, x) + 1);
        List<Double> expected = Arrays.asList(5D, 9D, 17D);
        assertThat(result, is(expected));
    }
}