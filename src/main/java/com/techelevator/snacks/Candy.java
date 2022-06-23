package com.techelevator.snacks;

import java.math.BigDecimal;

public class Candy extends Snack {

    public Candy (String snackName, BigDecimal snackPrice) {
        super(snackName, snackPrice);

    }

    @Override
    public String getSnackMessage() {
        return "Munch Munch, Yum!";
    }

}