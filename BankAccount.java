class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("💰 Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("❌ Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("💸 Withdrawn: $" + amount);
        }
    }

    public void showBalance() {
        System.out.println("🏦 Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000);
        myAccount.deposit(500);
        myAccount.withdraw(200);
        myAccount.showBalance();
    }
}
