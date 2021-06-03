
package bankaccount;

/**
 *
 * @author Hegy
 */
public class SpecialAccount extends Account { // its a class special Account inherits from class Account

    /**
     *
     */

    
    public SpecialAccount(){
        
    }
   
    /**
     *
     * @param acc
     * @param bal
     */
    public SpecialAccount(int acc, double bal){ // parametrized constructor
        super(acc, bal);
    }
  
    @Override
    double withdraw (double money) {  // override w ithdraw method 
      if (getBalance() - money > -1001){
        System.out.println("allowed");
        setBalance(getBalance()- money);
        return getBalance();
      }
      else  System.out.println("Not allowed");
         return 0;
    }
    
    
    @Override
    public String toString(){ //  override ToString Method to display info for special Account
        return " accnum: "+ getAccountnumber()+ "\n balance: "+getBalance() ;  
    }
} 

