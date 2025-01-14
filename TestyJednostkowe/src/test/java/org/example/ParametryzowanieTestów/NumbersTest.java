package org.example.ParametryzowanieTestów;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @ParameterizedTest
    @CsvSource({
            "-1, odd", //Success
            "0, zero", //Success
            "1, odd", //Success
            "2, even", //Success
            "100, even", //Success
            "zero, zero" //Fail
    })
    void checkParity(int number, String expected){
        assertEquals(expected, Numbers.checkParity(number));
    }

    static Stream<Arguments> getParityArguments(){
        return Stream.of(
                Arguments.of(-1,"odd"), //OK
                Arguments.of(0,"zero"),//OK
                Arguments.of(2,"even"),//OK
                Arguments.of("zero","zero")//FAIL
        );
    }

    @ParameterizedTest
    @MethodSource("getParityArguments")
    void checkParityMethodSource(int number, String expected){
        assertEquals(expected, Numbers.checkParity(number));
    }

}