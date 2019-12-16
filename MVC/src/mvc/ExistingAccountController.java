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
public class ExistingAccountController {
    private AccessExistingAccountView accessExistingAccount;
    private ShoppingCart shoppingCart;
    private Balance balance;
    
    
    
    public ExistingAccountController(AccessExistingAccountView accessExistingAccount, ShoppingCart shoppingCart, Balance balance){
    
        this.accessExistingAccount = accessExistingAccount;
        this.shoppingCart = shoppingCart;
        this.balance = balance;
        
      
    }
}
