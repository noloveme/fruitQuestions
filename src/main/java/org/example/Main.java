package org.example;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("苹果", 8);
        Fruit strawberry = new Fruit("草莓", 13);
        Fruit mango = new Fruit("芒果", 20);

        Customer customerA = new Customer(2, 3, 0);
        double totalA = Supermarket.calculateTotalPrice(customerA, apple, strawberry, mango);
        System.out.println("顾客 A 购买总价: " + totalA);

        Customer customerB = new Customer(1, 2, 1);
        double totalB = Supermarket.calculateTotalPrice(customerB, apple, strawberry, mango);
        System.out.println("顾客 B 购买总价: " + totalB);

        // 草莓打折
        Customer customerC = new Customer(3, 4, 2);
        //草莓打八折
        mango.setPrice(mango.getPrice()*Supermarket.DISCOUNT);
        double totalC = Supermarket.calculateTotalPrice(customerC, apple, strawberry,mango );
        System.out.println("顾客 C 购买总价（打折后）: " + totalC);

        // 总价满减
        Customer customerD = new Customer(2, 2, 7);
        double totalD = Supermarket.calculateTotalPrice(customerD, apple, strawberry, mango);
        if (totalD >= 100) {
            totalD -= 10;
        }
        System.out.println("顾客 D 购买总价（满减后）: " + totalD);
    }
}