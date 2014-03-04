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
public class FlatRateDiscount implements DiscountStrategy {
    
    private double flatRateAmnt;
    
    public FlatRateDiscount(double flatRateAmnt){
        setFlatRateAmnt(flatRateAmnt);
    }
    
    @Override
    public double getDiscountedPrice(double price, double qty){
        return (price * qty)-(flatRateAmnt);
    }
    @Override
    public double getAmountSaved(double price, double qty){
        return flatRateAmnt * qty;
    }

    public double getFlatRateAmnt() {
        return flatRateAmnt;
    }

    public void setFlatRateAmnt(double flatRateAmnt) {
        this.flatRateAmnt = flatRateAmnt;
    }
    
}
