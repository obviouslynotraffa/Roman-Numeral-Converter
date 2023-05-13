package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void convert3() throws ZeroException, BiggerThan5000Exception, NegativeNumberException{
        assertEquals(IntegerToRoman.convert(3), "III");
    }

    @Test
    public void convert6() throws ZeroException, BiggerThan5000Exception, NegativeNumberException{
        assertEquals(IntegerToRoman.convert(6), "VI");
    }

    @Test
    public void convert10() throws ZeroException, BiggerThan5000Exception, NegativeNumberException{
        assertEquals(IntegerToRoman.convert(10), "X");
    }
    

    @Test
    public void convert20() throws ZeroException, BiggerThan5000Exception, NegativeNumberException{
        assertEquals(IntegerToRoman.convert(20), "XX");
    }

    @Test
    public void convert50() throws ZeroException, BiggerThan5000Exception, NegativeNumberException{
        assertEquals(IntegerToRoman.convert(50), "L");
    }

    @Test
    public void convert100() throws ZeroException, BiggerThan5000Exception, NegativeNumberException{
        assertEquals(IntegerToRoman.convert(100), "C");
    }

    @Test
    public void convert200() throws ZeroException, BiggerThan5000Exception, NegativeNumberException{
        assertEquals(IntegerToRoman.convert(200), "CC");
    }

    @Test
    public void convert500() throws ZeroException, BiggerThan5000Exception, NegativeNumberException{
        assertEquals(IntegerToRoman.convert(500), "D");
    }

    @Test
    public void convert1000() throws ZeroException, BiggerThan5000Exception, NegativeNumberException{
        assertEquals(IntegerToRoman.convert(1000), "M");
    }

    //Testing exception
    @Test(expected = ZeroException.class)
    public void convertZero() throws ZeroException, BiggerThan5000Exception, NegativeNumberException{
        int zero=0;

        IntegerToRoman.convert(zero);
    }

    @Test(expected = NegativeNumberException.class)
    public void convertNegative() throws ZeroException, BiggerThan5000Exception, NegativeNumberException{
        int negative=-1;

        IntegerToRoman.convert(negative);
    }

    @Test(expected = BiggerThan5000Exception.class)
    public void convertGreaterThan5000() throws ZeroException, BiggerThan5000Exception, NegativeNumberException{
        int bigger=5001;

        IntegerToRoman.convert(bigger);
    }
}
