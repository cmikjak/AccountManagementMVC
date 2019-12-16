/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author mikol
 */
public class ShoppingCart {
    
    private double total;
    
    public void addUpTotal (double itemCost, double total)
    {
        total +=  itemCost;
    }
    
    
    public double getTotal() {
        return total;
    }
}
