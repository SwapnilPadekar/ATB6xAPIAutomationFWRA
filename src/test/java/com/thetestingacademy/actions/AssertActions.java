package com.thetestingacademy.actions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import io.restassured.response.Response;


public class AssertActions {

    public void verifyResponseBody(String actual, String expected, String description){
        assertEquals(actual, expected, description);
    }

    //method overloading
    public void verifyResponseBody(int actual, int expected, String description){
        assertEquals(actual, expected, description);
    }

    //method overloading
    public void verifyResponseBody(float actual, float expected, String description){
        assertEquals(actual, expected, description);
    }

    //method overloading
    public void verifyResponseBody(double actual, double expected, String description) {
        assertEquals(actual, expected, description);

    }

    //method overloading
    public void verifyResponseBody(boolean actual, boolean expected, String description) {
        assertEquals(actual, expected, description);
    }

    public void verifyStatusCodeInvalidReq(Response response) {
        assertTrue(String.valueOf(response.getStatusCode()).startsWith("50"),
                "value of status code is" + response.getStatusCode());
    }

    public void verifyStatusCode(Response response) {
        assertTrue(String.valueOf(response.getStatusCode()).startsWith("20"),
                "value of status code is" + response.getStatusCode());
    }

//    public void verifyStatusCode(Response response,Integer expected) {
//        assertEquals(response.getStatusCode(),expected);
//    }

}
