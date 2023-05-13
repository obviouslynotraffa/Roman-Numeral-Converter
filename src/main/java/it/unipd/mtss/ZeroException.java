////////////////////////////////////////////////////////////////////
// Michele Nelser 2000559
// Raffaele Paolo Fontana 2042895
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class ZeroException extends Exception {
    public ZeroException(){
        super("Zero doesn't exist in Roman numerlas !");
    }
}