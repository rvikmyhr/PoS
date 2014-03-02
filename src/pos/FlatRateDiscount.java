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
public class FlatRateDiscount implements DiscountStategy {
    
    private double flatRateAmnt;
    
    public FlatRateDiscount(double flatRateAmnt){
        setFlatRateAmnt(flatRateAmnt);
    }
    
    @Override
    public double getDiscount(double price, double qty){
        return (price * qty)-(flatRateAmnt);
    }

    public double getFlatRateAmnt() {
        return flatRateAmnt;
    }

    public void setFlatRateAmnt(double flatRateAmnt) {
        this.flatRateAmnt = flatRateAmnt;
    }
    
}
