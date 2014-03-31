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
public class TestDatabase implements DatabaseStrategy {

    private final Product[] products = {new Product("000", "Cola", 1.99, new QtyDiscount(.99)),
        new Product("001", "Clock", 9.99, new FlatRateDiscount(1.99)),
        new Product("002", "Purse", 49.99, new PercentDiscount(.15))
    };
    
    @Override
    public final Product findProduct(final String id) throws IllegalArgumentException{
        if (id == null || id.length() == 0){
            throw new IllegalArgumentException("ID needed");
        }
        Product product = null;
        if (id == null || id.length() == 0) {
            System.out.println("Invalid ID");
        } else {
            for (Product p : products) {
                if (id.equals(p.getProductID())) {
                    product = p;
                    break;
                }
            }
        }
        return product;
    }
    
    }

