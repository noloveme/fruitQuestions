package org.example;

public class Supermarket {

    //折扣
    public static double DISCOUNT = 0.8;
    public static double calculateTotalPrice(Customer customer, Fruit apple, Fruit strawberry, Fruit mango) {
        double totalPrice = customer.getApples() * apple.getPrice()
                + customer.getStrawberries() * strawberry.getPrice()
                + customer.getMangoes() * mango.getPrice();
        return totalPrice;
    }
}
