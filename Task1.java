public class Task1 {
    public static void main(String[] args) {
        double purchasePrice = 80.00;
        double salesTaxRate = 0.05;
        double salesTax = purchasePrice * salesTaxRate;

        // Final output
        System.out.println("Purchase Price: $" + purchasePrice);
        System.out.println("Sales Tax (5%): $" + salesTax);
        System.out.println("Total with Tax: $" + (purchasePrice + salesTax));
    }
}

