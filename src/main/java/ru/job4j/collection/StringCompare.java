package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = Integer.compare(left.length(), right.length());
        int len = rsl == 1 ? right.length() : left.length();
        for (int i = 0; i < len; i++) {
            int comp = Character.compare(left.charAt(i), right.charAt(i));
            if (comp != 0) {
                return comp;
            }
        }
        return rsl;
    }
}
