/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pos;

import java.util.Date;

/**
 *
 * @author rvikmyhr
 */
public class Receipt {
    
    private LineItem[] line;
    private Date date;
    private DatabaseStrategy database;
    private double totalTax;
    
    public Receipt() {
        line = new LineItem[0];
        date = new Date();
        database = new TestDatabase();
    }
    
    public double getCalcTotalDiscounts(){
        double totalDis = 0;
        for (LineItem x: line){
            totalDis += x.getTotalDiscount();
        }
        return totalDis;
    }
    
    public double getCalcTotal(){
        double totalPrice = 0;
        for (LineItem x: line){
            totalPrice += x.getCalcSubTotal();
        }
        return totalPrice;
    }
    
    public final void addLineItem(final String productID, final double qty) throws IllegalArgumentException {
        if (productID == null || productID.length() == 0){
            throw new IllegalArgumentException("Must have a value");
        }
        if (qty <= 0){
            throw new IllegalQtyException();
        }
        LineItem lineItem = new LineItem(database, productID, qty);
        addToArray(lineItem);
    }
    
    public void addToArray(LineItem item) throws IllegalArgumentException {
        if (item == null){
            throw new NullObjectException();
        }
        LineItem[] temp = new LineItem[line.length + 1];
        System.arraycopy(line, 0, temp, 0, line.length);
        temp[line.length] = item;
        line = temp;
    }
    
    public void printReceipt(){
        System.out.println(date);

        for (LineItem x: line){       
            System.out.println(x.getItem());
            System.out.println(x.getQty());
            System.out.println(x.getSubTotal());
            System.out.println(x.getTotalDiscount());
            System.out.println(getCalcTotal() - getCalcTotalDiscounts());
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) throws IllegalArgumentException {
        if (date == null){
            throw new NullObjectException();
        }
        this.date = date;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) throws IllegalArgumentException {
        if (totalTax < 0){
            throw new IllegalArgumentException("Invalid amount");
        }
        this.totalTax = totalTax;
    }
      
}
