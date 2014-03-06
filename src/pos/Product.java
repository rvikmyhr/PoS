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
public class Product {
    private String productID;
    private String productName;
    private double price;
    private DiscountStrategy discount;
    
    public Product(String productID, String productName, double price, DiscountStrategy discount){
        setProductID(productID);
        setProductName(productName);
        setPrice(price);
        setDiscount(discount);
    }
    
    public final double getAmountSaved(double qty){
        return discount.getAmountSaved(price, qty);
    }
    
    public final double getDiscountedPrice(double qty){
        return discount.getDiscountedPrice(price, qty);
    }

    public final String getProductID() {
        return productID;
    }

    public final void setProductID(String productID) {
        this.productID = productID;
    }

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        this.productName = productName;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }

    public final void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    

//    @Override
//    public String toString() {
//        return "Product{" + "productID=" + productID + ", productName=" + productName + ", price=" + price + ", discount=" + discount.getDiscountedPrice(price, 1) + '}';
//    }
//    
//    public static void main(String[] args) {
//        
//        Product thing = new Product("T100","Thing",19.99, new PercentDiscount(.10));
//        System.out.println(thing.toString());
//    }
    
}
