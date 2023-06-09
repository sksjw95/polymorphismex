package org.package2;

public class Customer {
    int money = 50000;

    void buyCoffee(Coffee coffee){
        if (money < coffee.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money = money - coffee.price;
        System.out.println(coffee + "를 구입했습니다.");
    }
}
