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
public class Balance {
    
    private double balance;
    
    public void subtractFromTotal (double balance, double total)
    {
        balance -= total;
    }
    
    
    public double getBalance() {
        return balance;
    }
}
