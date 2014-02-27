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
public class QtyDiscount implements DiscountStategy {

    private double qtyDiscount;
    private double price;
    private double qty;
    private double minQty;

    public QtyDiscount(double qtyDiscount) {
        setQtyDiscount(qtyDiscount);
    }

    public double getDiscount(double price, double qty) {
        double discount = 0;
        if (qty >= minQty) {
             discount = (qty * price) - qtyDiscount;
        }
        return discount;
    }

    public double getQtyDiscount() {
        return qtyDiscount;
    }

    public void setQtyDiscount(double qtyDiscount) {
        this.qtyDiscount = qtyDiscount;
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

    public double getMinQty() {
        return minQty;
    }

    public void setMinQty(double minQty) {
        this.minQty = minQty;
    }

    
}
