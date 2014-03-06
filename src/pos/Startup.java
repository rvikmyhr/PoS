/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pos;

/**
 *
 * @author rvikmyhr
 */
public class Startup {
    public static void main(String[] args) {
        
     CheckOutRegister reg = new CheckOutRegister();
     reg.startNewSale();
     reg.ScanItem("000", 4);
     reg.ScanItem("001", 1);
     reg.getReceipt().printReceipt();
     
    }
    
    
    
}
