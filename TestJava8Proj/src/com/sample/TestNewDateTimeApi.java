package com.sample;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Period;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TestNewDateTimeApi {
    public static void main(String[] args) {
        // LocalDate example
        LocalDate today = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2020, 1, 1);
        System.out.println("Today's Date: " + today);
        System.out.println("Specific Date: " + specificDate);

        // LocalTime example
        LocalTime currentTime = LocalTime.now();
        LocalTime specificTime = LocalTime.of(12, 30);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Specific Time: " + specificTime);

        // LocalDateTime example
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime specificDateTime = LocalDateTime.of(2020, 1, 1, 12, 30);
        System.out.println("Current DateTime: " + currentDateTime);
        System.out.println("Specific DateTime: " + specificDateTime);

        // ZonedDateTime example
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
        ZonedDateTime specificZonedDateTime = ZonedDateTime.of(specificDateTime, ZoneId.of("America/New_York"));
        System.out.println("Current ZonedDateTime: " + currentZonedDateTime);
        System.out.println("Specific ZonedDateTime: " + specificZonedDateTime);

        // Period example
        Period period = Period.between(specificDate, today);
        System.out.println("Period between dates: " + period.getYears() + " years, " + period.getMonths() + " months, and " + period.getDays() + " days");

        // Duration example
        Duration duration = Duration.between(specificTime, currentTime);
        System.out.println("Duration between times: " + duration.toHours() + " hours, " + duration.toMinutes() + " minutes, and " + duration.getSeconds() + " seconds");

        // Formatting and Parsing example
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(dateFormatter);
        LocalDate parsedDate = LocalDate.parse("01-01-2020", dateFormatter);
        System.out.println("Formatted Date: " + formattedDate);
        System.out.println("Parsed Date: " + parsedDate);

        // Adding and Subtracting Dates
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        LocalDate previousMonthSameDay = today.minus(1, ChronoUnit.MONTHS);
        System.out.println("Date after one week: " + nextWeek);
        System.out.println("Date before one month: " + previousMonthSameDay);

        // Getting day of the week and other details
        System.out.println("Day of the week: " + today.getDayOfWeek());
        System.out.println("Is leap year: " + today.isLeapYear());
    }
}
