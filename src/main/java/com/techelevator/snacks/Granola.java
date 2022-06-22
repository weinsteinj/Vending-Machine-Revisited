package com.techelevator.snacks;

public class Granola extends Snack {

    public Granola (String snackName, double snackPrice) {
        super(snackName, snackPrice);

    }
    @Override
    public String getSnackMessage() {
        return "Crunch, Chew, Yum!";
    }

}
