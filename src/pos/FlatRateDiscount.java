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
    private double price;
    private double qty;
    
    public FlatRateDiscount(double flatRateAmnt){
        setFlatRateAmnt(flatRateAmnt);
    }
    public double getDiscount(double price, double qty){
        return (price * qty)-(flatRateAmnt);
    }

    public double getFlatRateAmnt() {
        return flatRateAmnt;
    }

    public void setFlatRateAmnt(double flatRateAmnt) {
        this.flatRateAmnt = flatRateAmnt;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getQty() {
        return qty;
    }

    @Override
    public void setQty(double qty) {
        this.qty = qty;
    }
    
}
