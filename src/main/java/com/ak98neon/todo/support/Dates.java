package com.ak98neon.todo.support;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public final class Dates {
    private Dates() {
        throw new UnsupportedOperationException();
    }

    public static OffsetDateTime stringToDate(final String dateStr) {
        final LocalDate localDate = LocalDate.parse(dateStr, DateTimeFormatter.ISO_DATE_TIME);
        return OffsetDateTime.of(localDate, LocalTime.NOON, ZoneOffset.UTC);
    }

    public static LocalDate stringToLocalDate(final String dateStr) {
        return LocalDate.parse(dateStr, DateTimeFormatter.ISO_DATE_TIME);
    }

    public static boolean isDayOff(final DayOfWeek dayOfWeek) {
        return dayOfWeek.getValue() == 6 || dayOfWeek.getValue() == 7;
    }
}
