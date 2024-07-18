import java.util.*;

public class ATM_Machine {

    ATM_Machine() {

        Scanner sc = new Scanner(System.in);
        
        // Create an account
        BankAccount account = new BankAccount(1234, "Miku Kumar", 1000);
        
        // Create an ATM
        ATM atm = new ATM(account);
        
        // ATM interface
        System.out.println("Welcome to the ATM");
        System.out.println("Enter your PIN:");
        int pin = sc.nextInt();

        while(true){

            if (atm.validatePin(pin)) {
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");
                
                System.out.println("Enter your choice:");
                int choice = sc.nextInt();
                
                switch (choice) {
                    case 1:
                        atm.checkBalance();
                        break;
                    case 2:
                        System.out.println("Enter the amount to withdraw:");
                        double amountToWithdraw = sc.nextDouble();
                        atm.withdraw(amountToWithdraw);
                        break;
                    case 3:
                        System.out.println("Enter the amount to deposit:");
                        double amountToDeposit = sc.nextDouble();
                        atm.deposit(amountToDeposit);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM");
                        System.exit(4);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            } else {
                System.out.println("Invalid PIN");
            }
        }

    }
    public static void main(String args[]) {

        new ATM_Machine();

    }
}
