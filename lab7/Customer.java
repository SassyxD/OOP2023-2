
public class Customer {
    private String firstName;
    private String lastName;
    private CheckAccount acct;
    public Customer(){
        firstName = "";
        lastName = "";
        acct = null;
    }
    public Customer(String firstName, String lastName){
        Customer(firstName, lastName, acct = null);
        this.acct = null;
    }
    public Customer(String firstName, String lastName, CheckAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    public void setFirstName(String firstName){
    
    }
    public String getFirstName(){
    
    }
    public void setLastName(String lastnName){
    
    }
    public String getLastName(){
        
    }
    public void setAcct(CheckAccount acct){
    
    }
    public CheckingAccount getAcct(){
    
    }
    public String toString(){
    
    }
    public boolean equals(Customer c){
    
    }
    
}
