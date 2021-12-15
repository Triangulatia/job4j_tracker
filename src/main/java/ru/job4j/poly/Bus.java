package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        boolean go = true;
    }

    @Override
    public void passengers(int count) {
        int people = count;
    }

    @Override
    public double refuel(int fuel) {
        return fuel == 1 ? 2.24 : 0;
    }
}
