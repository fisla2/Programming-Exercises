import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        final double DOZEN_PRICE = 3.25;
        final double SINGLE_EGG_PRICE = 0.45;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of eggs in the order: ");
        int eggsOrdered = scanner.nextInt();  // Input from the user
        
        int dozens = eggsOrdered / 12;
        int singles = eggsOrdered % 12;
        
        double totalCost = dozens * DOZEN_PRICE + singles * SINGLE_EGG_PRICE;
        
        System.out.println("You ordered " + eggsOrdered + " eggs. That’s " + dozens + " dozen at $3.25 per dozen and " + singles + " loose eggs at 45 cents each for a total of $" + String.format("%.2f", totalCost) + ".");
    }
}
