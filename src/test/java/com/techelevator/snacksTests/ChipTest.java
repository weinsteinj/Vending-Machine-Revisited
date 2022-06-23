package com.techelevator.snacksTests;

import com.techelevator.snacks.Chip;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ChipTest {

    @Test
    public void get_snack_message_chip_returns_crunch_crunch_yum() {
        //arrange
        Chip lays = new Chip("", BigDecimal.valueOf(0.0));

        //act
        String actualMessage = lays.getSnackMessage();

        //assert
        Assert.assertEquals("Crunch Crunch, Yum!", actualMessage);
    }



}
