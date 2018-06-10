

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FizzBuzz.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FizzBuzzTest
{
    FizzBuzz fizzBuzz = new FizzBuzz();
    
    @Test
    public void testThreeToFifty()
    {
        
        
        String expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz "
        + "11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz "+
        "26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 "
        +"44 FizzBuzz 46 47 Fizz 49 Buzz ";
        String actual = fizzBuzz.printFizzBuzz(50);
        
        assertEquals(expected, actual);
        
    }
}
