package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class RomanPrinterTest {
    
    @Test
    public void Print1ASCII() throws NegativeNumberException, ZeroException, 
    BiggerThan5000Exception, NotRomanLetterException{
        int number= 1;
        String ascii= RomanPrinter.print(number);
        String I =(
            "  _____  \n"+
            " |_   _| \n"+
            "   | |   \n"+ 
            "   | |   \n"+ 
            "  _| |_  \n"+ 
            " |_____| \n");
            
            assertEquals(I , ascii);
    } 


    @Test
    public void Print5ASCII() throws NegativeNumberException, ZeroException, BiggerThan5000Exception, NotRomanLetterException {
        int number= 5;
        String ascii= RomanPrinter.print(number);
        String V =(
            " __      __ \n"+
            " \\ \\    / / \n"+
            "  \\ \\  / /  \n"+ 
            "   \\ \\/ /   \n"+ 
            "    \\  /    \n"+
            "     \\/     \n");
            
            assertEquals(V , ascii);
    } 


}
