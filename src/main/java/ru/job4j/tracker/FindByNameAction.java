package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class FindByNameAction implements UserAction {

    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ===");
        String name = input.askStr("Enter id: ");
        List<Item> list = tracker.findByName(name);
        if (list.size() > 0) {
            for (Item item : list) {
                out.println(item);
            }
        } else {
            out.println("Заявки с именем: " + name + " не найдены.");
        }
//        Item[] items = tracker.findByName(name);
//        if (items.length > 0) {
//            for (Item item : items) {
//                out.println(item);
//            }
//        } else {
//            out.println("Заявки с именем: " + name + " не найдены.");
//        }
        return true;
    }
}
