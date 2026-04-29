import java.util.ArrayList;
class Account
{
    private String accountHolder;
    private double balance;
    private ArrayList<Double> transactionHistory;
    public Account(String accountHolder, double balance)
    {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }
    public void deposit(double amount)
    {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive!");
        }
        balance += amount;
        addTransaction(amount);
        System.out.println("Deposit successful!");
    }
    public void processTransaction(double amount) throws InSufficientFundsException
    {
        if (amount <= 0)
            {
            throw new IllegalArgumentException("Amount must be positive!");
            }
        if (amount > balance)
            {
            throw new InSufficientFundsException("Not enough balance!");
            }
        balance -= amount;
        addTransaction(-amount);
        System.out.println("Transaction successful!");
    }
    private void addTransaction(double amount)
    {
        if (transactionHistory.size() == 5)
            {
            transactionHistory.remove(0);
            }
        transactionHistory.add(amount);
    }
    public void printMiniStatement()
    {
        System.out.println("\nLast 5 Transactions:");
        if (transactionHistory.isEmpty())
            {
            System.out.println("No transactions yet.");
            return;
            }

        for (double t : transactionHistory)
            {
            if (t > 0)
                System.out.println("Deposit: +" + t);
            else
                System.out.println("Withdraw: " + t);
            }
    }
    public void showBalance()
    {
        System.out.println("Current Balance: " + balance);
    }
}