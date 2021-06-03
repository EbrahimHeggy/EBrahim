
package bankaccount;

/**
 *
 * @author Hegy
 */
public class Client {
    private String name; // Client name
    private long nationalID; // Client national ID
    private String address; // Client address
    private String  phone; // Client phone num
    private Account account; // using aggregation in this class

    /**
     *
     */
    public Client() {}
    
    /**
     *
     * @param n
     * @param NID
     * @param a
     * @param p
     * @param acc
     */
    public Client(String n, long NID, String a, String p, Account acc){ // parametrized constructor
        name = n;
        nationalID = NID;
        address = a;
        phone = p;
        account = acc;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) { // setter for client name 
        this.name = name;
    }

    /**
     *
     * @param nationalID
     */
    public void setNationalID(long nationalID) {// setter for client National ID 
        this.nationalID = nationalID;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {// setter for client address
        this.address = address;
    }

    /**
     *
     * @param phone
     */
    public void setPhone(String phone) {// setter for client phone num
        this.phone = phone;
    }

    /**
     *
     * @param account
     */
    public void setAccount(Account account) {// setter for Account
        this.account = account;
    }

    /**
     *
     * @return
     */
    public String getName() { // getter for client name 
        return name;
    }

    /**
     *
     * @return
     */
    public long getNationalID() {// getter for client National ID 
        return nationalID;
    }

    /**
     *
     * @return
     */
    public String getAddress() {// getter for client address 
        return address;
    }

    /**
     *
     * @return
     */
    public String getPhone() {// getter for client  phone num
        return phone;
    }

    /**
     *
     * @return
     */
    public Account getAccount() {// getter for Acoount
        return account;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){ // ToString Method to display information of the Client
        return  " Name: "+this.getName()+"\n National ID: "+this.getNationalID()+"\n Address: "+this.getAddress()+"\n Phone: "+this.getPhone()+"\n"+this.getAccount();
    }
    
    
}
