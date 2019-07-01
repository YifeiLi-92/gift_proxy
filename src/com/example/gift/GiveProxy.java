package com.example.gift;

public class GiveProxy implements GiveGiftInterface {

    private Suitor suitor;

    public GiveProxy(Pursuit pursuit, String suitorName) {
        this.suitor = new Suitor(suitorName, pursuit);
    }

    @Override
    public void giveDolls() {
        suitor.giveDolls();
    }

    @Override
    public void giveFlowers() {
        suitor.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        suitor.giveChocolate();
    }
}
