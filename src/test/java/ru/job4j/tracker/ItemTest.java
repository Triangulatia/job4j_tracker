package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void itemAsc() {
        List<Item> items = Arrays.asList(
            new Item("first"),
            new Item("second"),
            new Item("last")
        );
        List<Item> expected = Arrays.asList(
                new Item("first"),
                new Item("last"),
                new Item("second")
        );
        Collections.sort(items, new ItemAscByName());
        assertThat(expected, is(items));
    }

    @Test
    public void itemDesc() {
        List<Item> items = Arrays.asList(
                new Item("first"),
                new Item("second"),
                new Item("last")
        );
        List<Item> expected = Arrays.asList(
                new Item("second"),
                new Item("last"),
                new Item("first")
        );
        Collections.sort(items, new ItemDescByName());
        assertThat(expected, is(items));
    }
}