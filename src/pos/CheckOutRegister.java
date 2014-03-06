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
public class CheckOutRegister {
    private Receipt receipt;
    
    public void ScanItem(String productID, int qty){
        receipt.addLineItem(productID, qty);
    }
    public void startNewSale(){
        receipt = new Receipt();
    }
}
