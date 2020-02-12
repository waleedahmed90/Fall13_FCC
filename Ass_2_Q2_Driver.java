
public class Driver {
    public static void main(String []args){
        SavingsAccount saver1=new SavingsAccount(2000.00);
        SavingsAccount saver2=new SavingsAccount(3000.00);
        
        saver1.modifyInterestRate(0.04);
        
        
        
        for(int i=1;i<=12;i++){
        
            System.out.println("Month: "+i);
            saver1.CalMonthlyInterest();
            saver2.CalMonthlyInterest();
            System.out.print("Saver-1: ");
            saver1.PrintAccHolder();
            System.out.print("Saver-2: ");
            saver2.PrintAccHolder();
            //System.out.println();
        }
        
        saver1.modifyInterestRate(0.05);
        
        System.out.println("\n\n\nNew Balances for next month: with a new interest rate:");
            saver1.CalMonthlyInterest();
            saver2.CalMonthlyInterest();
            System.out.print("Saver-1: ");
            saver1.PrintAccHolder();
            System.out.print("Saver-2: ");
            saver2.PrintAccHolder();
    }
}
