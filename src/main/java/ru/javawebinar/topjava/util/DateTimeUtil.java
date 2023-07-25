package ru.javawebinar.topjava.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static <T extends Comparable<T>> boolean isBetweenHalfOpen(T time, T startTime, T endTime) {
        return (startTime == null || time.compareTo(startTime) >= 0) && (endTime == null || time.compareTo(endTime) < 0);
    }

    public static LocalDateTime convertStartDateToLocalDateTime(LocalDate startDate) {
        return startDate == null ? LocalDateTime.MIN : startDate.atStartOfDay();
    }

    public static LocalDateTime convertEndDateToLocalDateTime(LocalDate endDate) {
        return endDate == null ? LocalDateTime.MAX : endDate.plusDays(1).atTime(LocalTime.MAX);
    }

    public static String toString(LocalDateTime ldt) {
        return ldt == null ? "" : ldt.format(DATE_TIME_FORMATTER);
    }

}

