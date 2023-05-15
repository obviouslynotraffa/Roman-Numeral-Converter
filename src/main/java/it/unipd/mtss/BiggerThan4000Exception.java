////////////////////////////////////////////////////////////////////
// Michele Nelser 2000559
// Raffaele Paolo Fontana 2042895
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class BiggerThan4000Exception extends Exception {
    public BiggerThan4000Exception(){
        super("Numbers greater than 4000 are not supported!");
    }
}
