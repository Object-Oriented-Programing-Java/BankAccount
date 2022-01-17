/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 * The CheckingAccount class is subclass of BankAccount class. 
 */
public class CheckingAccount extends BankAccount {
    
    private static final double FEE= 0.15;
    
    /**
     * The constructor calls the super class constructor and it initialize 
     * accountNumber to be the current value in accountNumber concatenated 
     * with –10.
     * @param name The owner of the account.
     * @param amount The beginning balance.
     */
    public CheckingAccount(String name, double amount){
       
        
        super(name, amount);
        
        super.setAccountNumber(getAccountNumber()+"-10");
        
    }//End of CheckingAccount.
    
    /**
     * The withdraw method, add a 15 cents fee for every withdraw, As well as it
     * allows you to remove money from the account if enough money is available, 
     * returns true if the transaction was completed, returns false if there was 
     * not enough money.
     * @param amount The amount to withdraw from the account.
     * @return True if there was sufficient funds to complete the transaction, 
     * false otherwise.
     */
    public boolean withdraw(double amount){
     
        boolean completed = true;
        
         amount += FEE;
        
        super.withdraw(amount);
       
        return completed;
    }//End of withdraw.
    
    
}//End of CheckingAccount class.
