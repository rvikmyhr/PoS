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
public class LineItem {
    
    private LineItem[] lineItem = new LineItem[0];
    private double subTotal;
    
    public LineItem(Product prod){
     
    }
    
    public double getSubTotal(Product prod, double qty){
        return prod.getPrice() * qty;
    }
}
