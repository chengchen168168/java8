package com.example.java8;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class DateUtils {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        localDate.format(DateTimeFormatter.ISO_ORDINAL_DATE);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(localDate.toString()+dayOfWeek);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.toString());

        Duration duration = Duration.ofMinutes(localTime.getMinute());
        System.out.println(duration.getSeconds());

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId.toString());

        Instant instant = Instant.now();
        System.out.println(instant.toString());

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDateTime.now());
        System.out.println(japaneseDate.toString());

        MinguoDate minguoDate = MinguoDate.from(LocalDateTime.now());
        System.out.println(minguoDate.toString());

        Function<String,Integer> function = Integer::parseInt;
        function.apply("1");
    }
}
