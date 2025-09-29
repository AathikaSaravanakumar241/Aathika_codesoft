import java.util.Scanner;

class bankAccount {
    private double Balance;

    public bankAccount(double initialbalance) {
        this.Balance = initialbalance;
    }

    public double getBalance() {
        return Balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            Balance += amount;
            System.out.println("Deposited Amount is : " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= Balance) {
            Balance -= amount;
            System.out.println("Withdrawn Amount: " + amount);
        } else if (amount > Balance) {
            System.out.println("Insufficient balance in your bank account!");
        } else {
            System.out.println("Invalid withdrawal amount.please deposit correct amount!");
        }
    }
}


class ATM {
    private bankAccount account;

    public ATM(bankAccount userAccount) {
        this.account = userAccount;
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + account.getBalance());
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nWelcome to ATM Menu!!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
}

// Main class
public class Task3 {
    public static void main(String[] args) {
        bankAccount userAccount = new bankAccount(1000.0); // Initial balance
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
