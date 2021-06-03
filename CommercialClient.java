
package bankaccount;

/**
 *
 * @author Hegy
 */
public class CommercialClient extends Client {// its a class CommercialClient inherits from class Client
    private long commercialID;
    
    /**
     *
     * @param n
     * @param NID
     * @param a
     * @param p
     * @param acc
     */
    public CommercialClient(String n, long NID, String a, String p, Account acc){ // parametrized constructor
        super(n,NID,a,p,acc);
        commercialID = NID;
    }
   
    /**
     *
     */
    public CommercialClient(){ //Default constructor to set a value for NationalID (00000000000000)
        this.setNationalID(00000000000000);
    }

    /**
     *
     * @param commercialID
     */
    public void setCommercialID(long commercialID) { // setter method for CommercialID
        this.commercialID = commercialID;
    }

    /**
     *
     * @return
     */
    public long getCommercialID() { // setter method for CommercialID
        return commercialID;
    }
    
    @Override
    public String toString(){ // ToString Method to display information of the CommercialClient
        return  " Name: "+this.getName()+"\n Commercial ID: "+this.getCommercialID()+"\n Address: "+this.getAddress()+"\n Phone: "+this.getPhone()+"\n"+this.getAccount();
    }
    
}
