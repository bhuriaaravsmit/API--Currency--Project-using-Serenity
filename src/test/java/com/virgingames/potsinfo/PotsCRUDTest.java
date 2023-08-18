package com.virgingames.potsinfo;

import com.virgingames.testbase.TestBase;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;
import org.junit.Test;

public class PotsCRUDTest extends TestBase {

    @Title("This will get IDs")
    @Test
    public void getBookingID() {
        SerenityRest.given()
                .basePath("/bingo")
                .header("Content-Type", "application/json")
                .when()
                .get()
                .then().log().all().statusCode(200);
    }


}
