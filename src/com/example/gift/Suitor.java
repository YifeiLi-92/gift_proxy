package com.example.gift;

public class Suitor implements GiveGiftInterface {

    private String name;

    private Pursuit pursuit;

    public Suitor(String name, Pursuit pursuit) {
        this.name = name;
        this.pursuit = pursuit;
    }

    @Override
    public void giveDolls() {
        System.out.println(name + "送洋娃娃给" + pursuit.getName());
    }

    @Override
    public void giveFlowers() {
        System.out.println(name + "送花给" + pursuit.getName());
    }

    @Override
    public void giveChocolate() {
        System.out.println(name + "送巧克力给" + pursuit.getName());
    }
}
