package com.example.gift;

public class GiftApplication {
    public static void main(String[] args) {
        GiveProxy proxy = new GiveProxy(new Pursuit("王瘦瘦"), "李胖胖");

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
