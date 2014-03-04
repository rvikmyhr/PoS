/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pos;

/**
 *
 * @author rvikmyhr
 */
public class LineItem {
    
    private double subTotal;
    private Product item;
    
    
    
    public LineItem(Product item){
        setItem(item);
    }

    public double getCalcSubTotal(Product item, double qty){
        subTotal = item.getPrice() * qty - item.getDiscount().getAmountSaved(item.getPrice(), qty);
        return subTotal;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Product getItem() {
        return item;
    }

    public void setItem(Product item) {
        this.item = item;
    }
    
//    @Override
//    public String toString() {
//        return "LineItem{" + "subTotal=" + subTotal + ", itemID=" + item.getProductID() + ", itemName=" + item.getProductName() +", itemPrice=" + item.getPrice() + ", itemDiscountedPrice=" + item.getDiscount() + '}';
//    }
//    
//    public static void main(String[] args) {
//        DiscountStrategy discount = new PercentDiscount(.10);
//        
//        Product thing = new Product("a11","hat", 50, discount);
//        
//        LineItem item = new LineItem(thing);
//        
//        item.getCalcSubTotal(thing, 2);
//        
//        System.out.println(item.toString());
//        
//    }
    
}
