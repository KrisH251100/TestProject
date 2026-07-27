package com.cucuBooking;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (glue= "com.stepBooking" , features = "src\\test\\resources\\BookingFeature")

public class RunnerBooking {

}
