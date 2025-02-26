import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4;  // Constant for quarts in a gallon
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of quarts needed: ");
        int quartsNeeded = scanner.nextInt();  // Input from the user
        
        int gallons = quartsNeeded / QUARTS_IN_GALLON;
        int remainingQuarts = quartsNeeded % QUARTS_IN_GALLON;
        
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallons + " gallons plus " + remainingQuarts + " quarts.");
    }
}
