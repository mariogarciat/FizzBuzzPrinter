package s4ncode;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class S4nCode {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Printer printer = new Printer();
        String[] vect = new String[100];
        vect = printer.fill(vect);
        printer.print(vect);
    }
    
    
}
