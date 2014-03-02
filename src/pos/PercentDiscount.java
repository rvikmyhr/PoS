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
public class PercentDiscount implements DiscountStategy {
    
    private double percent;

    public PercentDiscount(double percent){
        setPercent(percent);
    }
    
    @Override
    public double getDiscount(double price, double qty){     
        return price * qty * percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
    
    public static void main(String[] args) {
        
        DiscountStategy discStrat = new PercentDiscount(.50);
 
        System.out.println(discStrat.getDiscount(100,3));    
              
    }
    
}
