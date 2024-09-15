public class BankAccount {
    private final String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) throws InvalidAmountException{
        if(amount<=0){
            System.out.println("Attempting to deposit $" + amount);
            throw new InvalidAmountException("Invalid amount! Deposit must be positive.");
        }
        balance+=amount;
        System.out.println("Depositing $" + amount);
    }
    public void withdraw(double amount) throws InsufficientFundsException{
        System.out.println("Attempting to withdraw $" + amount);
        if(amount<=0){
            throw new InsufficientFundsException("Invalid amount! Withdraw must be positive.");
        }
        if(amount > balance){
            throw new InsufficientFundsException("Insufficient Funds!");
        }
        balance-=amount;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
}
