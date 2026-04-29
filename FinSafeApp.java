import java.util.Scanner;
public class FinSafeApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        Account acc = new Account(name, balance);
        int choice;
        do
        {
            System.out.println("\n1.Deposit  2.Withdraw  3.Balance  4.History  5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            try
            {
                switch (choice)
                {
                    case 1:
                        System.out.print("Enter amount: ");
                        acc.deposit(sc.nextDouble());
                        break;
                    case 2:
                        System.out.print("Enter amount: ");
                        acc.processTransaction(sc.nextDouble());
                        break;
                    case 3:
                        acc.showBalance();
                        break;
                    case 4:
                        acc.printMiniStatement();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } 
            catch (IllegalArgumentException e)
            {
                System.out.println("Error: " + e.getMessage());
            }
            catch (InSufficientFundsException e)
            {
                System.out.println("Error: " + e.getMessage());
            }
        }
        while (choice != 5);
        sc.close();
    }
}