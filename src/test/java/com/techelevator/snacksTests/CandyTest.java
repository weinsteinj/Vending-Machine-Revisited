package com.techelevator.snacksTests;

import com.techelevator.snacks.Candy;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CandyTest {
    @Test
    public void get_snack_message_candy_returns_munch_munch_yum() {
        //arrange
        Candy snickers = new Candy("", BigDecimal.valueOf(0.0));

        //act
        String actualMessage = snickers.getSnackMessage();

        //assert
        Assert.assertEquals("Munch Munch, Yum!", actualMessage);
    }


}
