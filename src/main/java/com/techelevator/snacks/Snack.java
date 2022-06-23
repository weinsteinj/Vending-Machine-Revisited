package com.techelevator.snacks;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Objects;

public abstract class Snack {
    private String snackName;
    private BigDecimal snackPrice;
    private int stockAmount = 5;

    public Snack(String snackName, BigDecimal snackPrice) {
        this.snackName = snackName;
        this.snackPrice = snackPrice;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public BigDecimal getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(BigDecimal snackPrice) {
        this.snackPrice = snackPrice;
    }

    @Override
    public String toString() {
        String stockAmountMessage = stockAmount > 0 ? stockAmount + " remaining" : "SOLD OUT";
        return snackName + " | " + NumberFormat.getCurrencyInstance().format(snackPrice) + " | " + stockAmountMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return stockAmount == snack.stockAmount && Objects.equals(snackName, snack.snackName) && Objects.equals(snackPrice, snack.snackPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snackName, snackPrice, stockAmount);
    }

    public abstract String getSnackMessage();

    public int getStockAmount() {
        return stockAmount;
    }
    public void decrementStock() {
        this.stockAmount = stockAmount -1;
    }



}
