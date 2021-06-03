

package bankaccount;
import java.util.ArrayList;

/**
 *
 * @author Hegy
 */
public class Bank {
    private String name; // Bank name 
    private String address; // Bank address
    private String phone; // Bank phone num
    private ArrayList<Account> accounts = new ArrayList<Account>(); // this array maintains all accounts’ data.
    private ArrayList<Client> clients = new ArrayList<Client>(); //  this array maintains all clients’ data.

    /**
     *
     */
    public Bank(){ //  Default constructor
        name = "";
        address = "";
        phone = "";
    }
    
    /**
     *
     * @param n
     * @param add
     * @param p
     */
    public Bank(String n, String add, String p){ //parametrized constructor to set the " name , address , phone num "
        name = n;
        address = add;
        phone = p;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) { // setter for bank name
        this.name = name;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) { // setter for bank address
        this.address = address;
    }

    /**
     *
     * @param phone
     */
    public void setPhone(String phone) { // setter for bank phone
        this.phone = phone;
    }

    /**
     *
     * @return
     */
    public String getName() { // getter for bank name 
        return name;
    }

    /**
     *
     * @return
     */
    public String getAddress() { // getter for bank address
        return address;
    }

    /**
     *
     * @return
     */
    public String getPhone() {// getter for bank phone
        return phone;
    }
    
    /**
     *
     * @param a
     */
    public void addAccount(Account a){ //  add a new account
        accounts.add(a);
    }
    
    /**
     *
     * @param c
     */
    public void addClient(Client c){ //  add a new client 
        clients.add(c);
    }
    
    /**
     *
     */
    public void printAccounts(){ // method to display accounts
        System.out.println(accounts);
    }
    
    /**
     *
     */
    public void printClients(){ //  method to display clients
        System.out.println(clients);
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){ //  override ToString Method to display bank`s information
        return "Bank name: "+this.getName()+"\nBank address: "+this.getAddress()+"\nBank phone: "+this.getPhone() ;  
    }
    
    /**
     *
     * @param nacc
     * @return
     */
    public Client SearchClient(int nacc){ // searching for clients and get them
        int f = 0;
        for(int i =0; i<accounts.size(); i++){
            if(accounts.get(i).getAccountnumber() == nacc){
                f=i;
                break;
            }
        }
      return clients.get(f); 
    }
    
    /**
     *
     * @param nacc
     * @return
     */
    public Account SearchAccount(int nacc){ // searching for accounts and get them
        int f = 0;
        for(int i = 0 ; i<accounts.size(); i++){
            if(accounts.get(i).getAccountnumber() == nacc){
                f=i;
                break;
            }
        }
      return accounts.get(f);  
    }
}
