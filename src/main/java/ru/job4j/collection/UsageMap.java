package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("triangulationtri@gmail.com", "Frolov Yuriy Olegovich");
        for (String key: map.keySet()) {
            System.out.println("email: " + key + " " + "FIO: " + map.get(key));
        }
    }
}
