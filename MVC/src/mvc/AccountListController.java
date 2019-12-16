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
public class AccountListController {
    private AccountListView accountList;
    private ShoppingCart shoppingCart;
    private Balance balance;
    
    
    
    public AccountListController(AccountListView accountList, ShoppingCart shoppingCart, Balance balance){
    
        this.accountList = accountList;
        this.shoppingCart = shoppingCart;
        this.balance = balance;
        
      
    }
}
