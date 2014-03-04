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
public interface DiscountStrategy {

    public abstract double getDiscountedPrice(double price, double qty);
    public abstract double getAmountSaved(double price, double qty);
    
}
