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
    public double getDiscountedPrice(double price, double qty){     
        return (price * qty) - (price * qty * percent);
    }
    
    public double getAmountSaved(double price, double qty){
        return price * qty * percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
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
