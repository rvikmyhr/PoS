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
    public double getDiscountedPrice(double price, double qty) throws IllegalArgumentException{
        if (price <= 0){
            throw new IllegalPriceException();
        }
        if (qty <= 0){
            throw new IllegalQtyException();
        }
        return (price * qty)-(flatRateAmnt);
    }
    @Override
    public double getAmountSaved(double price, double qty) throws IllegalArgumentException{
        if (price <= 0){
            throw new IllegalPriceException();
        }
        if (qty <= 0){
            throw new IllegalQtyException();
        }
        return flatRateAmnt * qty;
    }

    public double getFlatRateAmnt() {
        return flatRateAmnt;
    }

    public void setFlatRateAmnt(double flatRateAmnt) throws IllegalArgumentException{
        if (flatRateAmnt <= 0) {
            throw new IllegalDiscountException();
        }
        this.flatRateAmnt = flatRateAmnt;
    }
    
}
