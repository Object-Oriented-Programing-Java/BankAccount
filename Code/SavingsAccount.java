/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *  The SavingsAccount class is subclass of BankAccount class.
 */
public class SavingsAccount extends BankAccount{
    
    private double rate = 2.5/100;
    private int SavingsNumber = 0;
    private String AccountNumber;
    
    /**
     * The constructor calls the super class constructor and it initialize 
     * accountNumber to be the current value in the superclass accountNumber 
     * concatenated with a hyphen and then the savingsNumber.
     * @param name The owner of the account.
     * @param amount The beginning balance.
     */
    public SavingsAccount(String name, double amount){
        super(name, amount);
        AccountNumber=super.getAccountNumber()+"-"+SavingsNumber;
    }// End of SavingsAccount constructor.
    
    /**
     * The copy constructor calls of the superclass copy constructor, and assign 
     * the savingsNumber to be one more than the savingsNumber of the original 
     * savings account. It assign the accountNumber to be the accountNumber of 
     * the superclass concatenated with the hyphen and the savingsNumber of the 
     * new account.
     * @param oldAccount The account with information to copy.
     * @param amount The beginning balance of the new account.
     */
    public SavingsAccount(SavingsAccount oldAccount, double amount){
        super(oldAccount,amount);
        SavingsNumber++;
        AccountNumber=super.getAccountNumber()+"-"+SavingsNumber;
    }// End of SavingsAccount copy constructor.
    
    /**
     * The postInterest method calculates one month's worth of interest on the 
     * balance and deposit it into the account.
     */
    public void postInterest(){
        double interest;
        interest = (super.getBalance() * rate) / 12;
      super.deposit(interest);
    }//End of postInterest.
    
   /**
    * Overrides the getAccountNumber method in the superclass.
    * @return  The Savings Account Number.
    */
    public String getAccountNumber(){
        return AccountNumber;
    }//End of getAccountNumber.
}
