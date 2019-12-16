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
public class CreateAccountController {
    private CreateAccountView createAccount;
    private ShoppingCart shoppingCart;
    private Balance balance;
    
    
    
    public CreateAccountController(CreateAccountView createAccount, ShoppingCart shoppingCart, Balance balance){
    
        this.createAccount = createAccount;
        this.shoppingCart = shoppingCart;
        this.balance = balance;
        
      
    }
}
