import java.util.*;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully. \nNew Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. \nNew Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class ATM {
    private Scanner sc;
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    public void display() {
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an Option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    sc.close(); // Fix: Close Scanner before exiting
                    return; 
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + account.getBalance());
    }

    public void deposit() {
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    public void withdraw() {
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0);
        ATM atm = new ATM(userAccount);
        atm.display();
    }
}
