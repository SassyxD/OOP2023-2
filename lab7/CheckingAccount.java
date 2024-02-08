
public class CheckingAccount extends Account{
    private double credit;
    public CheckingAccount(){
        super(0,"");
        this.credit = 0;
    }
    public CheckingAccount(double balacnce, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        }else {
            System.out.println("Input number must be a positive interger.");
        }
    }
    public double getCredit(){
        return credit;
    }
    @Override
    public void withdraw(double a){
        if (a > 0){
            if ((getBalance()-a) >= 0){
                super.withdraw(a);
                System.out.println( a + " baht is withdraw from "+name+ " and your credit balance is "+credit+'.');
            }else if ((getBalance()- a + credit) > 0){
                setBalance((getBalance() - a) + credit);
                System.out.println( a + " baht is withdraw from "+name+ " and your credit balance is "+credit+'.');
            }else if ((getBalance()- a + credit) > 0) {
                System.out.println("Not enough money!");
            }
        }
    }
    public void withdraw(String a){
        withdraw(double.doubleParse(a));
    }
    @Override
    public String toString(){
        return ("The " + name + " accout has " + balance + " baht and "+ credit + " credit.");
    }
}
