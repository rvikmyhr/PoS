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
    
    private double qty;
    private double subTotal;
    private double totalDiscount;
    private Product product;
    private DatabaseStrategy database;
    
    public LineItem(DatabaseStrategy database, String productID, double qty){
        this.database = database;
        this.product = findProduct(productID);
        setQty(qty);
    }
    
    public final Product findProduct(String productID){
        return database.findProduct(productID);
    }
    
    public final double getCalcSubTotal(){
        subTotal = product.getPrice() * qty;
        return subTotal;
    }
    
    public final double getTotalDiscount(){
        totalDiscount = product.getDiscountedPrice(qty);
        return totalDiscount;
    }

    public final double getSubTotal() {
        return subTotal;
    }

    public final void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public final Product getItem() {
        return product;
    }

    public final void setItem(Product item) {
        this.product = item;
    }

    public final double getQty() {
        return qty;
    }

    public final void setQty(double qty) {
        this.qty = qty;
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public final DatabaseStrategy getDatabase() {
        return database;
    }

    public final void setDatabase(DatabaseStrategy database) {
        this.database = database;
    }
    
    
    public static void main(String[] args) {
        DiscountStrategy discount = new PercentDiscount(.10);
        DatabaseStrategy db = new TestDatabase();
        
        LineItem item = new LineItem(db,"000",3);
        
        System.out.println();
        
    }
    
}
