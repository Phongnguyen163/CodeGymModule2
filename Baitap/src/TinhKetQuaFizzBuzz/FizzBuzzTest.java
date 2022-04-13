package TinhKetQuaFizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
        //input 9 = Fizz, nine = 9, 73 = Fizz;
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
        //input 20 = Buzz, twenty = 20, buzz = 15;
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
        //input 15 = FizzBuzz, 45 = forty five, 15 = buzz;
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
        //input 17 = 17, 80 = eighty, 19 = 19;
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
        //input -17 = -17, 101 = Does not exceed 100, 49 = 49
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
