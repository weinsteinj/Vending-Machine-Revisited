package com.techelevator.snacksTests;

import com.techelevator.snacks.Granola;
import org.junit.Assert;
import org.junit.Test;

public class GranolaTest {

    @Test
    public void buy_e5_message_returns_crunch_chew_yum (){
        //arrange
        Granola granolaMix = new Granola("Granola Mix", 1.75 );


        //act
        String actual = granolaMix.getSnackMessage();

        //assert
        Assert.assertEquals("Crunch, Chew, Yum!", actual);
    }
}
