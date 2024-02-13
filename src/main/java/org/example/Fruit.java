package org.example;

public class Fruit {
    private String name; // 水果名称
    private double price; // 价格

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
