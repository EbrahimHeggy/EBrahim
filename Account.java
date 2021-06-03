
package bankaccount;

/**
 *
 * @author Hegy
 */
public class Account {
    private int accountnumber; //Account num
    private double balance; // Balance
   
    /**
     *
     */
    public Account(){ //Default constructor
        
        accountnumber=0;
        balance = 0;
    }

    /**
     *
     * @param acc
     * @param bal
     */
    public Account(int acc, double bal){//parametrized constructor
        accountnumber = acc;
        balance = bal;
    }

    /**
     *
     * @param accountnumber
     */
    public void setAccountnumber(int accountnumber) { // setter for acc num
        this.accountnumber = accountnumber;
    }

    /**
     *
     * @param balance
     */
    public void setBalance(double balance) { // setter for balance
        this.balance = balance;
    }

    /**
     *
     * @return
     */
    public int getAccountnumber() { // getter for acc num
        return accountnumber;
    }

    /**
     *
     * @return
     */
    public double getBalance() { // getter for balance
        return balance;
    }
  
    double withdraw (double money) {  // Withdraw method
          if (balance - money <0 ){
            System.out.println("Not allowed");
          }
          else
          {
            return balance -= money;
          }
          return 0;
    }

    double deposit(double money) { // Deposite method
        return balance += money;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){ // ToString Method to display information 
        return " accnum: "+ accountnumber+ "\n balance: "+getBalance() ;  
    }

}
