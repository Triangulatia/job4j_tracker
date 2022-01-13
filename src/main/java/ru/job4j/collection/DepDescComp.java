package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] left = o1.split("/");
        String[] right = o2.split("/");
        int len = Math.min(left.length, right.length);
        int rsl = right[0].compareTo(left[0]);
        if (rsl == 0) {
            for (int i = 1; i < len; i++) {
                rsl = left[i].compareTo(right[i]);
                if (rsl != 0) {
                    return rsl;
                }
            }
            return Integer.compare(left.length, right.length);
        }
        return rsl;
    }
}
