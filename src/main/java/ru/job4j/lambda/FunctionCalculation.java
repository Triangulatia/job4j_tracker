package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionCalculation {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        Supplier<List<Double>> supplier = ArrayList::new;
        List<Double> list = supplier.get();
        Consumer<Double> consumer = list::add;
        for (int i = start; i < end; i++) {
            consumer.accept(func.apply((double) i));
        }
        return list;
    }
}
