import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfNumberFromTextTest {
    private SumOfNumberFromText sumOfNumberFromText = new SumOfNumberFromText();
    @Test
    public void testOfPositiveNumber() {
        String text = "I am 14 years old. I was born in 2005. It is 2019 outside.";
        assertEquals(4038,sumOfNumberFromText.positiveIntSum(text));
    }
    @Test
    public void testOfNegativeNumbers() {
        String text = "I had a number -3 as output in a test. I hoped I would get -1.";
        assertEquals(0,sumOfNumberFromText.positiveIntSum(text));
    }
    @Test
    public void testOfPositiveNumbersInsideOfWords() {
        String text = "Recently, I bought a bicycle. I spend400UAH";
        assertEquals(400,sumOfNumberFromText.positiveIntSum(text));
    }

    @Test
    public void testOfNegativeNumbersInsideOfWords() {
        String text = "My rating dropped down to-40position";
        assertEquals(0,sumOfNumberFromText.positiveIntSum(text));
    }
}
