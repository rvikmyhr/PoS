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
public class NullObjectException extends IllegalArgumentException {

    private static final String message = "Cannot be null. Value needed.";

    public NullObjectException() {
    }

    public NullObjectException(String msg) {
        super(message);
    }
    
    public NullObjectException(String msg, Throwable cause){
        super(message, cause);
    }
    public NullObjectException(Throwable cause){
        super(cause);
    }
    
    @Override
    public String getMessage(){
        return message;
    }
    
}
