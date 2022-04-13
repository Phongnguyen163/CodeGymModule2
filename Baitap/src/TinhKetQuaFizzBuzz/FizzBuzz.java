package TinhKetQuaFizzBuzz;

public class FizzBuzz {
    public static String fizzBuzzCheck(int number) {
        if (number > 0) {
            if (number % 3 == 0) {
                if (number % 5 == 0) {
                    return "FizzBuzz";
                }
                return "Fizz";
            } else if (number % 5 == 0) {
                return "Buzz";
            } else {
                return number + "";
            }
        } else {
            return number + "";
        }
    }

    public static String translate(int number) {
        int firstNumber, secondNumber;
        if (number < 10) {
            if (number == 0) {
                return "Zero";
            } else {
                return underTen(number);
            }
        } else if (number < 21) {
            return underTwenty(number);
        } else if (number < 100) {
            firstNumber = number / 10;
            secondNumber = number % 10;
            return underHundred(firstNumber) + underTen(secondNumber);
        } else {
            return "Does not exceed 100";
        }
    }

    public static String divideNumber(int number) {
        int firstNumber, secondNumber;
        firstNumber = number / 10;
        secondNumber = number % 10;
        if (firstNumber == 3) {
            return "Fizz";
        } else if (firstNumber == 5) {
            return "Buzz";
        } else if (secondNumber == 3) {
            return "Fizz";
        } else if (secondNumber == 5) {
            return "Buzz";
        } else {
            return number + "";
        }
    }

    public static String underTen(int number) {
        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    public static String underTwenty(int number) {
        switch (number) {
            case 0:
                return "zero";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            case 20:
                return "twenty";
            default:
                return "";
        }
    }

    public static String underHundred(int number) {
        switch (number) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }
}
