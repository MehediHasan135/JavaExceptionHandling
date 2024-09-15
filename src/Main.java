public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("231 037 6135", 100.0);
        System.out.println("Account Number : " + account.getAccountNumber());
        try{
            account.deposit(50.0);
            System.out.println("New balance: $" + account.getBalance());
        } catch(InvalidAmountException e){
            System.out.println(e.getMessage());
        }
        try {
            account.withdraw(200.0);
            System.out.println("New balance: $" + account.getBalance());
        } catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
        try{
            account.withdraw(50.0);
            System.out.println("New balance: $" + account.getBalance());
        } catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
        try {
            account.deposit(-10.0);
            System.out.println("New balance: $" + account.getBalance());
        } catch(InvalidAmountException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Final balance: $" + account.getBalance());
            System.out.println("End of transaction.");
        }

    }
}
