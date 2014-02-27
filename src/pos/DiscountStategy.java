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
public interface DiscountStategy {

    double getDiscount(double price, double qty);
    
    double getPrice();

    double getQty();

    void setPrice(double price);

    void setQty(double qty);
    
}
