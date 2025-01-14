package org.DateUtils;

import org.example.DateUtils.DateUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.DayOfWeek;
import java.util.stream.Stream;

class DateUtilsTest {

    @ParameterizedTest
    @MethodSource("checkTheWeekend")
    void testIsWeekend (DayOfWeek dayOfWeek, boolean expected){
        Assertions.assertEquals(expected, DateUtils.isWeekend(dayOfWeek));
    }

    static Stream<Object[]> checkTheWeekend(){
        return Stream.of(
                new Object[]{DayOfWeek.MONDAY, true}, //Fail
                new Object[]{DayOfWeek.TUESDAY, true}, //Fail
                new Object[]{DayOfWeek.WEDNESDAY, false}, //OK
                new Object[]{DayOfWeek.THURSDAY, false},//OK
                new Object[]{DayOfWeek.FRIDAY, false},//OK
                new Object[]{DayOfWeek.SATURDAY, true},//OK
                new Object[]{DayOfWeek.SUNDAY, false}//FAIL
        );
    }

}