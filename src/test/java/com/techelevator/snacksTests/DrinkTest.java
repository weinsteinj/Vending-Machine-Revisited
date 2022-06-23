package com.techelevator.snacksTests;

import com.techelevator.snacks.Chip;
import com.techelevator.snacks.Drink;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class DrinkTest {

    @Test
    public void get_snack_message_drink_returns_glug_glug_yum() {
        //arrange
        Drink sevenUp = new Drink("", BigDecimal.valueOf(0.00));

        //act
        String actualMessage = sevenUp.getSnackMessage();

        //assert
        Assert.assertEquals("Glug Glug, Yum!", actualMessage);
    }
}
