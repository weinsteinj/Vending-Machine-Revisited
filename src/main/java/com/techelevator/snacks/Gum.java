package com.techelevator.snacks;

import java.math.BigDecimal;

public class Gum extends Snack {

    public Gum (String snackName, BigDecimal snackPrice) {
        super(snackName, snackPrice);

    }

    @Override
    public String getSnackMessage() {
        return "Chew Chew, Yum!";
    }



}
