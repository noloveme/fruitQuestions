package org.example;

public class Customer {
    private int apples; // 苹果数量
    private int strawberries; // 草莓数量
    private int mangoes; // 芒果数量

    public Customer(int apples, int strawberries, int mangoes) {
        this.apples = apples;
        this.strawberries = strawberries;
        this.mangoes = mangoes;
    }

    public int getApples() {
        return apples;
    }

    public int getStrawberries() {
        return strawberries;
    }

    public int getMangoes() {
        return mangoes;
    }
}
