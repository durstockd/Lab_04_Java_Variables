public class Task3 {
    public static void Task3(String[] args) {
        double initialBalance = 5000.00;
        double interestRate = 0.17;

        double interestMonth1 = initialBalance * interestRate;
        double balanceMonth1 = initialBalance + interestMonth1;

        double interestMonth2 = balanceMonth1 * interestRate;
        double balanceMonth2 = balanceMonth1 + interestMonth2;

        System.out.println("Initial Balance: $" + initialBalance);
        System.out.println("Interest after 1 month: $" + interestMonth1);
        System.out.println("Balance after 1 month: $" + balanceMonth1);
        System.out.println("Interest after 2 months: $" + interestMonth2);
        System.out.println("Balance after 2 months: $" + balanceMonth2);
    }
}
