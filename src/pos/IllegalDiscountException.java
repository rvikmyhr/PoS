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
public class IllegalDiscountException extends IllegalArgumentException {

    private static final String message = "Discount amount is not valid";

    public IllegalDiscountException() {
    }

    public IllegalDiscountException(String msg) {
        super(message);
    }
    
    public IllegalDiscountException(String msg, Throwable cause){
        super(message, cause);
    }
    public IllegalDiscountException(Throwable cause){
        super(cause);
    }
    
    @Override
    public String getMessage(){
        return message;
    }
    
}
