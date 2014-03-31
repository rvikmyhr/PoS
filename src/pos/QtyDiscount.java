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
public class QtyDiscount implements DiscountStrategy {

    private double qtyDiscount;
    private double price;
    private double qty;
    private double minQty;

    public QtyDiscount(double qtyDiscount) {
        setQtyDiscount(qtyDiscount);
    }

    @Override
    public double getDiscountedPrice(double price, double qty) throws IllegalArgumentException {
        double discount = 0;
        if (price <= 0){
            throw new IllegalPriceException();
        }
        if (qty <= 0){
            throw new IllegalQtyException();
        }
        if (qty >= minQty) {
             discount = (qty * price) - qtyDiscount;
        }
        return discount;
    }
    
    public double getAmountSaved(double price, double qty) throws IllegalArgumentException {
        double saved = 0;
        if (price <= 0){
            throw new IllegalPriceException();
        }
        if (qty <= 0){
            throw new IllegalQtyException();
        }
        if (qty >= minQty) {
             saved = qtyDiscount;
        }
        return saved;
    }

    public double getQtyDiscount() {
        return qtyDiscount;
    }

    public void setQtyDiscount(double qtyDiscount) throws IllegalArgumentException {
        if(qtyDiscount <= 0){
            throw new IllegalDiscountException();
        }
        this.qtyDiscount = qtyDiscount;
    }
    
    public double getMinQty() {
        return minQty;
    }

    public void setMinQty(double minQty) throws IllegalArgumentException {
        if (minQty <= 1){
            throw new IllegalQtyException();
        }
        this.minQty = minQty;
    }
  
}
