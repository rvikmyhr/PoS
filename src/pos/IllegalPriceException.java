/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pos;

/**
 *
 * @author Ron
 */
public class IllegalPriceException extends IllegalArgumentException {

    private static final String message = "Price amount is invalid";

    public IllegalPriceException() {
    }

    public IllegalPriceException(String msg) {
        super(message);
    }
    
    public IllegalPriceException(String msg, Throwable cause){
        super(message, cause);
    }
    public IllegalPriceException(Throwable cause){
        super(cause);
    }
    
    @Override
    public String getMessage(){
        return message;
    }
    
}
