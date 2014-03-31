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
public class PercentDiscount implements DiscountStrategy {
    
    private double percent;

    public PercentDiscount(double percent){
        setPercent(percent);
    }
    
    @Override
    public double getDiscountedPrice(double price, double qty) throws IllegalArgumentException{
        if (price <= 0){
            throw new IllegalPriceException();
        }
        if (qty <= 0){
            throw new IllegalQtyException();
        }
        return (price * qty) - (price * qty * percent);
    }
    
    public double getAmountSaved(double price, double qty){
        if (price <= 0){
            throw new IllegalPriceException();
        }
        if (qty <= 0){
            throw new IllegalQtyException();
        }
        return price * qty * percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) throws IllegalArgumentException {
        if (percent <= 0){
            throw new IllegalDiscountException();
        }
        this.percent = percent;
    }
    
//    public static void main(String[] args) {
//        
//        DiscountStrategy discStrat = new PercentDiscount(.50);
// 
//        System.out.println(discStrat.getDiscountedPrice(100,3));    
//              
//    }
    
}
