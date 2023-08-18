package com.virgingames.bingoinfo;

import io.restassured.response.ValidatableResponse;
import jxl.common.Assert;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class PotsSteps {

    @Step("Fetch Pots information with currency: {3}")
    public ValidatableResponse getCurrency(String currency) {


        ValidatableResponse response = SerenityRest.given()
                .headers("Content-Type", "application/json")
                .queryParam("currency", currency)
                .when()
                .get()
                .then().log().all().statusCode(200);

        List<String> actualCurrency = response.extract().path("data.pots.currency");
        for(String output: actualCurrency){
                 Assert.verify(output.equals(currency), currency);
        }
        System.out.println(actualCurrency);

        return response;


    }


    }




