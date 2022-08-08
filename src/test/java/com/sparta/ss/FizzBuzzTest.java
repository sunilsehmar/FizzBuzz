package com.sparta.ss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    @DisplayName("Given the value is 3, return Buzz")
    void givenValueIs3ThenReturnBuzz() {
        Assertions.assertEquals("Buzz", FizzBuzz.getValue(3));
    }

    @Test
    @DisplayName("Given the value is 5, return Fizz")
    void givenValueIs5ThenReturnFizz() {
        Assertions.assertEquals("Fizz", FizzBuzz.getValue(5));

    }

    @Test
    @DisplayName("Given the value is Divisible by 3, return Buzz")
    void givenValueIsDivThenReturnBuzz() {
        Assertions.assertEquals("Buzz", FizzBuzz.getValue(9));

    }

    @Test
    @DisplayName("Given the value is Divisible by 5, return Fizz")
    void givenValueIsDivThenReturnFizz() {
        Assertions.assertEquals("Fizz", FizzBuzz.getValue(10));

    }
}

