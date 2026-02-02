class Account {
    double balance;

    Account() {
        balance = 0;
    }

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Account acc = new Account(5000);
        acc.deposit(2000);
        acc.withdraw(1500);
        acc.displayBalance();
    }
}
