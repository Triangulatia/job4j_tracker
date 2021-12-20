package ru.job4j.ex;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void calcFail() {
        new Fact().calc(-1);
    }

    @Test
    public void calcSuccess() {
        int expected = 2;
        int rsl = new Fact().calc(2);
        Assert.assertEquals(expected, rsl);
    }
}