package com.thetestingacademy.modules;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.thetestingacademy.pojos.Booking;
import com.thetestingacademy.pojos.BookingDates;
import com.thetestingacademy.pojos.BookingResponse;

public class PayloadManager {

    Faker faker = new Faker();
    Gson gson = new Gson();

    public String createPayloadBookingAsString(){

        Booking booking = new Booking(); // Booking class

//        booking.setFirstname(faker.name().firstName());
//        booking.setLastname(faker.name().lastName());

        booking.setFirstname("Naina");
        booking.setLastname(faker.name().lastName());
        booking.setTotalprice(faker.random().nextInt(987));
        booking.setDepositpaid(true);

        BookingDates bookingdates = new BookingDates(); // BookingDates class
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-15");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast, Lunch, Snacks");

        return gson.toJson(booking);
    }

    public String createInvalidPayloadBookingAsString(){
        return "{}";
    }

    public String fullUpdatePayloadAsString(){

        Booking booking = new Booking(); // Booking class
        booking.setFirstname("Shweta");
        booking.setLastname(faker.name().lastName());
        booking.setTotalprice(faker.random().nextInt(789));
        booking.setDepositpaid(true);

        BookingDates bookingdates = new BookingDates(); // BookingDates class
        bookingdates.setCheckin("2024-02-14");
        bookingdates.setCheckout("2024-02-20");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast, Lunch, Snacks");

        return gson.toJson(booking);
    }

    public BookingResponse bookingResponseJava(String responseString){
        BookingResponse bookingResponse = gson.fromJson(responseString, BookingResponse.class);
                return bookingResponse;
    }

}
