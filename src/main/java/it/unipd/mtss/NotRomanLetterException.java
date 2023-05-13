////////////////////////////////////////////////////////////////////
// Michele Nelser 2000559
// Raffaele Paolo Fontana 2042895
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NotRomanLetterException extends Exception{
    public NotRomanLetterException(char c){
        super("The letter "+ c + "is not a in the Roman set numerals");
    }
}   
