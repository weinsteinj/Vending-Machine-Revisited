package com.techelevator.snacks;

import java.math.BigDecimal;

public class Drink extends Snack {

    public Drink (String snackName, BigDecimal snackPrice) {
        super(snackName, snackPrice);

    }

    @Override
    public String getSnackMessage() {
        return "Glug Glug, Yum!";
    }

}
