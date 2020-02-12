
public class SavingsAccount {
    private static double AnnualInterestRate;
    
    private double savingsBalance;
    
    
    public SavingsAccount(double bal){
        this.savingsBalance=bal;
    }
    
    public void set_bal(double bal){
        this.savingsBalance=bal;
    }
    public double get_bal(){
        return this.savingsBalance;
    }
    
    public void CalMonthlyInterest(){
        this.savingsBalance+= ((this.savingsBalance*AnnualInterestRate)/12);
    }
    
    public static void modifyInterestRate(double newRate){
        AnnualInterestRate=newRate;
    }
    
    public void PrintAccHolder(){
        System.out.println("Current Balance: $"+this.savingsBalance);
    }
}
