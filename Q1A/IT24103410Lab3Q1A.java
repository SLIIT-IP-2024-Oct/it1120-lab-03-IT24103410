import java.util.Scanner;

public class IT24103410Lab3Q1A { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the price of 1 kg of rice: ");
            double pricePerKg = scanner.nextDouble();
            
            
            if (pricePerKg < 0) {
                System.out.println("Price cannot be negative. Please enter a valid price.");
                return;
            }
            
            System.out.print("Enter the number of kilograms you want to buy: ");
            double quantity = scanner.nextDouble();
            
          
            if (quantity < 0) {
                System.out.println("Quantity cannot be negative. Please enter a valid quantity.");
                return;
            }
            
          
            double totalAmount = pricePerKg * quantity;
            
           
            System.out.printf("The total amount to pay is: %.2f%n", totalAmount);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}