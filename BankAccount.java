
package bankaccount;
import java.util.Scanner;

/**
 *
 * @author Hegy
 */
public class BankAccount {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int l = 0; 
        System.out.println("Bank manager section");
        Scanner in = new Scanner(System.in); // taking input from user
        System.out.println("Enter Bank (name, address, phone)");
        String B_N = in.next(); // take BankName as a input
        String B_A = in.next();// take BankAddress as a input
        String B_P = in.next();// take BankPhone as a input
        Bank b = new Bank(B_N, B_A, B_P); // create an object from Bank class
        System.out.println("Enter how many clients will be added ? ");
        int n = in.nextInt(); // taking the number of clients
        System.out.println("==========================================" + "\nClients section start");

        for (int j = 0; j <= n; j++) { 
            if(n==j){ 
                System.out.println("If you already have an account press 2");
            }
            else{ 
                System.out.println("If you are a new client press 1" + "\nIf you already have an account press 2");
            }
            
            int x0 = in.nextInt(); 
            if (x0 == 2) { // if the client have an account
                j--;
                while (true) {
                    System.out.println("Enter your account number");
                    int nacc = in.nextInt(); // input for account num
                    b.SearchClient(nacc); // get the client by his AccountNumber
                    while (true) {
                        System.out.println("if you want Withdrawal press 1" + "\n for Deposit press 2" + "\n for print your information press 3" + "\n for Exit press 4");
                        int x_ = in.nextInt(); // input variable to choose the function
                        if (x_ == 1) { // 1st choice for withdraw function
                            System.out.println("Enter the amount");
                            double money = in.nextDouble();// input the amount of money you wanna withdraw
                            b.SearchAccount(nacc).withdraw(money); // get the account of client and run the withdraw function on it
                            System.out.println(b.SearchAccount(nacc).toString()); // display account`s information after withdraw
                        } else if (x_ == 2) { // 2nd choice for withdraw function
                            System.out.println("Enter the amount"); 
                            double money = in.nextDouble(); // input the amount of money you wanna deposite
                            b.SearchAccount(nacc).deposit(money); // get the account of client and run the deposite function on it
                            System.out.println(b.SearchAccount(nacc).toString()); // display account`s information after deposite
                        } else if (x_ == 3) { // 3rd choice for print info function
                            System.out.println(b.SearchClient(nacc).toString()); // display account`s information 
                        } else {
                            break; // stop the inner loop after choosing the function and run it
                        }
                    }
                    break; // stop the outer loop 

                }
            } else { // if the clients wanna create a new account 
                while (true) {
                    System.out.println("WELLCOME" + "\nFirst you need to create account");
                    System.out.println("If you want regular account press 1" + "\nIF you want special account press 2");
                    int x = in.nextInt(); // variable for choosing the account type
                    Account a; // create object 

                    l++;
                    if (x == 1) { // if the client choose regular Account
                        a = new Account(); // create object from Account class
                        a.setAccountnumber(l); // set the Accountnumber
                        System.out.println("enter your balance");
                        double bal = in.nextDouble(); // variable to input the Balance 
                        a.setBalance(bal); // set the Balance
                        System.out.println("Account is created");
                    } else { 
                        a = new SpecialAccount(); // create object from SpecialAccount class
                        a.setAccountnumber(l); // set the Accountnumber
                        System.out.println("enter your balance");
                        double bal = in.nextDouble(); // variable to input the Balance 
                        a.setBalance(bal); // set the Balance
                        System.out.println("Account is created"); 
                    }
                    System.out.println("If you regular client press 1 " + "\nIF you commercial client press 2");
                    Client c; // create an object from Client class
                    int x2 = in.nextInt(); // input the choice "regular client or commercial client"
                    if (x2 == 1) { // if the user choose regular client
                        System.out.println("Enter your (name ,national id ,address ,phone)");
                        String name = in.next(); // client name as input
                        long NID = in.nextLong();// client national ID as input
                        String add = in.next();// client address as input
                        String ph = in.next();// client phone as input
                        c = new Client(name, NID, add, ph, a); // create object with parametrized constructor
                    } else { // if the user choose commercial client
                        System.out.println("Enter your (name ,commercial id ,address ,phone)");
                        String name = in.next();// client name as input
                        long NID = in.nextLong();// client national ID as input
                        String add = in.next();// client address as input
                        String ph = in.next();// client phone as input
                        c = new CommercialClient(name, NID, add, ph, a); // create object with parametrized constructor
                    }
                    while (true) {
                        System.out.println("if you want Withdrawal press 1" + "\nfor Deposit press 2" + "\nfor print your information press 3" + "\nfor Exit press 4");
                        int x3 = in.nextInt(); // choose the function that client wanna do
                        if (x3 == 1) { // 1st choice for withdraw
                            System.out.println("Enter the amount");
                            double money = in.nextDouble(); // input the money you wanna withdraw
                            a.withdraw(money); // run the function
                            System.out.println(a.toString());// display information of the Client after withdraw
                        } else if (x3 == 2) { // 2nd choice for deposite
                            System.out.println("Enter the amount");
                            double money = in.nextDouble();  // input the money you wanna deposite
                            a.deposit(money); // run the function
                            System.out.println(a.toString()); // display information of the Client after deposite
                        } else if (x3 == 3) { // 3rd choice for display the information
                            System.out.println(c.toString());
                        } else {
                            break; // end 
                        }
                    }

                    b.addAccount(a); // add an Account 
                    b.addClient(c); // add a Client
                    break; // finish the Client section
                }

            }

        }

        System.out.println("=======================================" + "\nBank information section starts");
        while (true) {
            System.out.println("IF you want bank info press 1" + "\nIf  you want to display all accounts press 2" + "\nIf you want to display all clients press 3" + "\nIf you want yo Exit press 4");
            int x4 = in.nextInt(); // 4th choice to choose the diplay function
            if (x4 == 1) { // 1st choice for diplay Bank info
                System.out.println(b.toString());
            } else if (x4 == 2) { // 2nd choice for diplay all Accounts
                b.printAccounts();
            } else if (x4 == 3) {// 3rd choice for diplay all Clients
                b.printClients();
            } else { // end the Bank info section
                System.out.println("Bank information section ended");
                break; // end
            }
        }

    }

}
