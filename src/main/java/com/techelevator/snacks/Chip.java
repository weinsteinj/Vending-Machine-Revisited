package com.techelevator.snacks;

import java.math.BigDecimal;

public class Chip extends Snack {

    public Chip (String snackName, BigDecimal snackPrice) {
        super(snackName, snackPrice);

    }

    @Override
    public String getSnackMessage() {
        return "Crunch Crunch, Yum!";
    }

}
