package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length; i++) {
            products[i] = i + 1 < products.length ? products[i + 1] : null;
        }
        return products;
    }
}
