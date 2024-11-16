import java.util.Scanner;

public class IT24103410Lab3Q1B {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter the total bill amount: ");
        double totalBill = scanner.nextDouble();
        
        
        double discount = 0.10; 
        double discountAmount = totalBill * discount;
        
        
        double finalAmount = totalBill - discountAmount;
        
        
        System.out.printf("Total Bill Amount: %.2f\n", totalBill);
        System.out.printf("Discount Amount (10%%): %.2f\n", discountAmount);
        System.out.printf("Final Amount to Pay: %.2f\n", finalAmount);
        
        
        scanner.close();
    }
}