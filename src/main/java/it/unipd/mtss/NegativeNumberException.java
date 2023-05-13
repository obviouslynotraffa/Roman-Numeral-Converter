////////////////////////////////////////////////////////////////////
// Michele Nelser 2000559
// Raffaele Paolo Fontana 2042895
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class NegativeNumberException extends Exception {
    public NegativeNumberException(){
        super("Negative numbers don't exist in Roman numerlas !");
    }
}
