package com.omrbranch.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue = "com.stepBooking",
		features = "src\\test\\resources\\BookingFeature\\Booking.feature",
		plugin = {"pretty", "html:target/CucumberReport.html" },
		monochrome = true,
		dryRun = false
		)

public class TestRunnerClass {

}
