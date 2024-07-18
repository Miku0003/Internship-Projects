public class ATM {
    private BankAccount account;
    
    public ATM(BankAccount account) {
        this.account = account;
    }
    
    public boolean validatePin(int pin) {
        // In a real scenario, you would validate the PIN against a database
        return pin == account.getAccountNumber();
    }
    
    public void checkBalance() {
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Balance: " + account.getBalance());
    }
    
    public void withdraw(double amount) {
        account.withdraw(amount);
    }
    
    public void deposit(double amount) {
        account.deposit(amount);
    }
}

