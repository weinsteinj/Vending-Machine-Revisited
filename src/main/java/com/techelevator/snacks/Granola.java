package com.techelevator.snacks;

import java.math.BigDecimal;

public class Granola extends Snack {

    public Granola (String snackName, BigDecimal snackPrice) {
        super(snackName, snackPrice);

    }
    @Override
    public String getSnackMessage() {
        return "Crunch, Chew, Yum!";
    }

}
