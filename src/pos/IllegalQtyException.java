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
public class IllegalQtyException extends IllegalArgumentException {

    private static final String message = "Invalid quantity amount";

    public IllegalQtyException() {
    }

    public IllegalQtyException(String msg) {
        super(message);
    }
    
    public IllegalQtyException(String msg, Throwable cause){
        super(message, cause);
    }
    public IllegalQtyException(Throwable cause){
        super(cause);
    }
    
    @Override
    public String getMessage(){
        return message;
    }
    
}
