package TinhKetQuaFizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzzCheckFizz() {
        String expected = "Fizz";
        String number = FizzBuzz.fizzBuzzCheck(9);
        assertEquals(expected, number);

        String expected1 = "nine";
        String translate = FizzBuzz.translate(9);
        assertEquals(expected1, translate);

        String expected2 = "Fizz";
        String anyNumberHasA3 = FizzBuzz.divideNumber(73);
        assertEquals(expected2, anyNumberHasA3);
    }

    @Test
    void fizzBuzzCheckBuzz() {
        String expected = "Buzz";
        String number = FizzBuzz.fizzBuzzCheck(20);
        assertEquals(expected, number);

        String expected1 = "twenty";
        String translate = FizzBuzz.translate(20);
        assertEquals(expected1, translate);

        String expected2 = "Buzz";
        String anyNumberHasA3 = FizzBuzz.divideNumber(65);
        assertEquals(expected2, anyNumberHasA3);
    }

    @Test
    void fizzBuzzCheckFizzBuzz() {
        String expected = "FizzBuzz";
        String number = FizzBuzz.fizzBuzzCheck(15);
        assertEquals(expected, number);

        String expected1 = "fortyfive";
        String translate = FizzBuzz.translate(45);
        assertEquals(expected1, translate);

        String expected2 = "Buzz";
        String anyNumberHasA3 = FizzBuzz.divideNumber(15);
        assertEquals(expected2, anyNumberHasA3);
    }

    @Test
    void fizzBuzzCheckNotModulus() {
        String expected = "17";
        String number = FizzBuzz.fizzBuzzCheck(17);
        assertEquals(expected, number);

        String expected1 = "eighty";
        String translate = FizzBuzz.translate(80);
        assertEquals(expected1, translate);

        String expected2 = "19";
        String anyNumberHasA3 = FizzBuzz.divideNumber(19);
        assertEquals(expected2, anyNumberHasA3);
    }

    @Test
    void fizzBuzzCheckNegative() {
        String expected = "-17";
        String number = FizzBuzz.fizzBuzzCheck(-17);
        assertEquals(expected, number);

        String expected1 = "Does not exceed 100";
        String translate = FizzBuzz.translate(101);
        assertEquals(expected1, translate);

        String expected2 = "49";
        String anyNumberHasA3 = FizzBuzz.divideNumber(49);
        assertEquals(expected2, anyNumberHasA3);
    }
}
