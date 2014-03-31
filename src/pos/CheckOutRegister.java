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
    
    public void ScanItem(final String productID, final double qty) throws IllegalArgumentException {
        if (productID == null || productID.length() == 0){
            throw new IllegalArgumentException("ID needed");
        }
        if(qty <=0){
            throw new IllegalQtyException();
        }
        receipt.addLineItem(productID, qty);
    }
    
    public void startNewSale(){
        receipt = new Receipt();
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) throws IllegalArgumentException {
        if (receipt == null){
            throw new NullObjectException();
        }
        this.receipt = receipt;
    }
    
}
