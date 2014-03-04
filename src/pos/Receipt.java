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
    private Date date = new Date();
    private double totalTax;
    private double grandTotal;
    
    public Receipt(double totalTax){
        setTotalTax(totalTax);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }

    @Override
    public String toString() {
        return "Receipt{" + "line=" + line + ", date=" + date + ", totalTax=" + totalTax + '}';
    }
    
    
    
}
