package com.virgingames.potsinfo;

import com.virgingames.bingoinfo.PotsSteps;
import com.virgingames.testbase.TestBase;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class PostCRUDTEstWithSteps extends TestBase {




@Steps
    PotsSteps potsSteps;

    @Title("get all Booking Data")
    @Test
    public void test001()
    {
        ValidatableResponse response =potsSteps.getCurrency("GBP");
    }


    @Title("get all Booking Data")
    @Test
    public void test002()
    {
        ValidatableResponse response=potsSteps.getCurrency("EUR");
    }

    @Title("get all Booking Data")
    @Test
    public void test003()
    {
        ValidatableResponse response= potsSteps.getCurrency("SEK");
    }

}
