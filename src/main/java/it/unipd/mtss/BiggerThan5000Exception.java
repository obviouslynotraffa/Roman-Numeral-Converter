////////////////////////////////////////////////////////////////////
// Michele Nelser 2000559
// Raffaele Paolo Fontana 2042895
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class BiggerThan5000Exception extends Exception {
    public BiggerThan5000Exception(){
        super("Numbers greater than 5000 don't exist in Roman numerals!");
    }
}
