package org.example.DateUtils;

import java.time.DayOfWeek;

public class DateUtils {
    public static boolean isWeekend (DayOfWeek dayOfWeek){
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }
}
